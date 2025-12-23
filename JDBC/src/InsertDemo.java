import java.sql.*;

class InsertDemo {
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
            String query = String.format("INSERT INTO students(name,age,marks) VALUES('%s',%o,%f)","Rahul",25,75.20);

            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println("Data Inserted Sucessfully");
            }else{
                System.out.println("Data not inserted");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}