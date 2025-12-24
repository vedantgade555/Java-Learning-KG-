package BatchProcessing;

import java.sql.*;
import java.util.Scanner;

class BatchProcessingPreparedStatementDemo {
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
            Scanner sc = new Scanner(System.in);
//            Statement statement = connection.createStatement();
            String query = String.format("INSERT INTO students(name,age,marks)VALUES(?,?,?)");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            while(true){
                System.out.println("Enter Name: ");
                String name = sc.next();
                System.out.println("Enter age");
                int age = sc.nextInt();
                System.out.println("Enter marks");
                double marks = sc.nextDouble();

                System.out.println("Enter more data(Y/N): ");
                String choice = sc.next();

                preparedStatement.setString(1,name);
                preparedStatement.setInt(2,age);
                preparedStatement.setDouble(3,marks);

                preparedStatement.addBatch();
                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }

            int[] arr = preparedStatement.executeBatch();


            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    System.out.println("Query: "+i+"Not Executed Sucessfully");
                }
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}