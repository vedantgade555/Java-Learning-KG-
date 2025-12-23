import java.sql.*;
class Main{
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
            String query = "select * from students";
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");

                System.out.println("ID: "+id);
                System.out.println("Name: "+name);
                System.out.println("Age: "+age);
                System.out.println("Marks: "+marks);


            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}