package fr.jdbc_mysql;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectData {


    private static Connection connection;

    static {

        try {

            DriverManager.registerDriver(new Driver());

            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/starwars", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public static Connection getConnection()
    {
        return connection;
    }*/
}
