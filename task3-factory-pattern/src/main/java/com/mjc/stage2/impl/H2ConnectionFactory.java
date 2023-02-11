package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {
    // Write your code here!
    @Override
    public Connection createConnection(){
        Connection connection = null;
        Properties properties = new Properties();
        try {
            properties.load(H2ConnectionFactory.class.getClassLoader().getResourceAsStream("h2database.properties"));
            connection = DriverManager.getConnection(
                    properties.getProperty("db_url"),
                    properties.getProperty("user"),
                    properties.getProperty("password"));
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return connection;
    }

}

