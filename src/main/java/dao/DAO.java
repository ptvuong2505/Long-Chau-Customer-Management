package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.InputStream;

public class DAO {
    private static String serverName;
    private static String dbName;
    private static String portNumber;
    private static String instance;
    private static String userID;
    private static String password;

    static {
        try (InputStream input = DAO.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            serverName = prop.getProperty("serverName");
            dbName = prop.getProperty("dbName");
            portNumber = prop.getProperty("portNumber");
            instance = prop.getProperty("instance");
            userID = prop.getProperty("userID");
            password = prop.getProperty("password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + "\\" + instance + ";databaseName=" + dbName + ";encrypt=false;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
}