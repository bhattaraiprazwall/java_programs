import java.sql.*;
public class MyDatabaseApplication
{
    public static void main(String []args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
            // System.out.println("Connected");
            Statement statement=conn.createStatement();
            
            String sqlStmt = "INSERT IGNORE INTO student (Name,Address,Program) VALUES ('Nawaraj','Koteshowor','BBA')";
            statement.executeUpdate(sqlStmt);
            ResultSet resultSet=statement.executeQuery("select *from student");

            while(resultSet.next())
                System.out.println(resultSet.getInt(1)+ " " + resultSet.getString(2)+ " "  +resultSet.getString(3) + " "+  resultSet.getString(4));
                resultSet.close();
                statement.close();
                conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}