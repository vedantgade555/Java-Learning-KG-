package Transactions;

import java.sql.*;
import java.util.Scanner;

class TransactionDemo {

    private static final String url = "jdbc:mysql://localhost:3306/lenden";
    private static final String userName = "root";
    private static final String password = "vedant@555";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, userName, password);

            // 🔐 Start Transaction
            connection.setAutoCommit(false);

            String debitQuery =
                    "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
            String creditQuery =
                    "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

            PreparedStatement debitPS = connection.prepareStatement(debitQuery);
            PreparedStatement creditPS = connection.prepareStatement(creditQuery);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter amount to transfer: ");
            double amount = sc.nextDouble();

            int fromAccount = 101;
            int toAccount = 102;

            if (isSufficient(connection, fromAccount, amount)) {

                debitPS.setDouble(1, amount);
                debitPS.setInt(2, fromAccount);

                creditPS.setDouble(1, amount);
                creditPS.setInt(2, toAccount);

                int debitRows = debitPS.executeUpdate();
                int creditRows = creditPS.executeUpdate();

                if (debitRows > 0 && creditRows > 0) {
                    connection.commit(); // ✅ Success
                    System.out.println("Transaction Successful");
                } else {
                    connection.rollback(); // ❌ Fail
                    System.out.println("Transaction Failed");
                }

            } else {
                System.out.println("Insufficient Balance");
            }

            connection.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔍 Balance Check
    static boolean isSufficient(Connection connection,
                                int accountNumber,
                                double amount) {

        try {
            String query =
                    "SELECT balance FROM accounts WHERE account_number = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, accountNumber);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double currentBalance = rs.getDouble("balance");
                return currentBalance >= amount;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
