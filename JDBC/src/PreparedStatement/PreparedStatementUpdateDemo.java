package PreparedStatement;

import java.sql.*;

class PreparedStatementUpdateDemo {
    private static final String url="jdbc:mysql://localhost:3306/javadb";
    private static final String userName="root";
    private static final String password="vedant@555";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
            String query = "UPDATE students SET marks= ? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1,87.5);
            preparedStatement.setInt(2,3);

            int rowsAffected = preparedStatement.executeUpdate();

            if(rowsAffected>0){
                System.out.println("Updated Sucessfully");
            }else{
                System.out.println("Not Deleted inserted");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}