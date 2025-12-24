package PreparedStatement;

import java.sql.*;

class PreparedStatementDemo {
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
            String query = "INSERT INTO students(name,age,marks) VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Aniket");
            preparedStatement.setInt(2,25);
            preparedStatement.setDouble(3,84.7);

            int rowsAffected = preparedStatement.executeUpdate();

            if(rowsAffected>0){
                System.out.println("Inserted Sucessfully");
            }else{
                System.out.println("Not Deleted inserted");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}