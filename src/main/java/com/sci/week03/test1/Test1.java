package com.sci.week03.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test1 {

  static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
  static final String USER = "system";
  static final String PASS = "system";
  static final String QUERY = "SELECT * FROM hr.employees";

  public static void main(String[] args) {

    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

      System.out.println("Connected database successfully...");

      PreparedStatement statement = conn.prepareStatement(QUERY);

      ResultSet res = statement.executeQuery();

      while (res.next()) {
        System.out.println(res.getInt("employee_id"));
        System.out.println(res.getString("first_name"));
        System.out.println(res.getString("last_name"));
        System.out.println("******************");
      }

    } catch (SQLException e) {
    }

  }
}
