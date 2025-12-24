package PreparedStatement;

import java.sql.*;

class PreparedStatementRetrieveDemo {
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
            String query = "SELECT marks FROM students WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,1);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                double marks = resultSet.getDouble("marks");
                System.out.println("Marks: "+marks);
            }else{
                System.out.println("Marks Not Found");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}