package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class NewsDB {

    public static boolean addNews(News news){
        String sql = "INSERT INTO news(title, news_text, time_published) " +
                "VALUES(?, ?, now())";
        int result = 0;

        try(Connection conn = DataBase.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, news.getTitle());
            stmt.setString(2, news.getText());

            result = stmt.executeUpdate();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }
}


