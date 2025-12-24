import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class DeleteDemo {
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
            String query = String.format("DELETE FROM students WHERE id=2");

            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println("Deleted Sucessfully");
            }else{
                System.out.println("Not Deleted inserted");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}