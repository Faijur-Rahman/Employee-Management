package empManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection connection;

    public static Connection createDBconnection(){

        try {

            //loading driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //getting connection
            String url="jdbc:mysql://localhost:3306/emp";
            String userName="test";
            String pass="1234";

            connection = DriverManager.getConnection(url,userName,pass);

        } catch (Exception e) {

            e.printStackTrace(); //only to use in development not in production
        }


        //getting the connection
        return connection;

    }

}
