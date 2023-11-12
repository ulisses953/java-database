package model;

import java.sql.Connection;

public class Database {
    private String Driver;
    private String URL;
    private String user;
    private String password;

    public String getDriver() {
        return Driver;
    }
    public void setDriver(String driverClassName) {
        Driver = driverClassName;
    }
    public String getURL() {
        return URL;
    }
    public void setURL(String uRL) {
        URL = uRL;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String username) {
        this.user = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
