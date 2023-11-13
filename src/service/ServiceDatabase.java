package service;

import java.sql.*;
import java.util.List;

import org.postgresql.core.SqlCommand;

import model.Database;

public class ServiceDatabase {

    /**
     * 
     * @param database
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Connection Connected(Database database) throws SQLException, ClassNotFoundException {
        Class.forName(database.getDriver());
        return DriverManager.getConnection(database.getURL(),database.getUser(), database.getPassword());
    }
    /**
     * 
     * @param con
     * @param select
     * @return
     * @throws SQLException
     */
    public ResultSet select (Connection con, String select) throws SQLException{
        return con.createStatement().executeQuery(select);
    }
    /**
     * 
     * @param con
     * @param select
     * @param parameter
     * @return
     */
    /*public ResultSet select (Connection con, String select, String... parameter){
        
    }*/
}
