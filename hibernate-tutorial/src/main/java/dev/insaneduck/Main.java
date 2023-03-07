package dev.insaneduck;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/student?useSSL=false";
        String user = "root";
        String password = "password";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("connection successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}