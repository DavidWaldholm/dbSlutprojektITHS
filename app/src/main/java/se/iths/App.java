package se.iths;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class App {
  public static final String SQL_SELECT_ALL_ARTISTS = "SELECT * FROM Artist LIMIT 50";

  public static void main(String[] args) {
      try {
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Chinook", "iths", "iths");
          ResultSet rs = con.createStatement().executeQuery(SQL_SELECT_ALL_ARTISTS);
          while (rs.next()) {
              long id = rs.getLong("ArtistId");
              String name = rs.getString("Name");
              System.out.println(new Artist(id, name));
              
              System.out.println();
          }
      } catch (Exception e) {
          System.out.println("fel");
      }
  }
}
