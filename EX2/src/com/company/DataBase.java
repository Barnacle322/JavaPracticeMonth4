package com.company;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "PokemonGO12345";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }

    public static void getNews(int id) {
        String sql = "select title, news_text from news where id = ?";

        int result = 0;

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)){

             stmt.setInt(1, id);

             ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Title: " + rs.getString("title") + "\nText: " + rs.getString("news_text"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deleteNews(int id) {
        String sql = "delete from news where id = ?";

        int result = 0;

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            System.out.println("Deleted");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


//    public static void getNews(int id){
//        String sql = "select title, news_text from news" +
//                "where id = ?";
//        News news = null;
//
//        try(Connection conn = DataBase.connect();
//            PreparedStatement stmt = conn.prepareStatement(sql)){
//
//            stmt.setInt(1, id);
//
//            try(ResultSet rs = stmt.executeQuery()){
//
//                if (rs.next()){
//                    news = new News();
//                    news.setTitle(rs.getString("title"));
//                    news.setText(rs.getString("news_text"));
//                }
//            }
//        }
//        catch (SQLException ex){
//            System.out.println(ex.getMessage());
//        }
//        System.out.println(news);
//    }
}
