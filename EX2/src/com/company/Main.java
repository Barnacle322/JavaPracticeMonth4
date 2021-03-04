package com.company;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        News news_1 = new News("Putin ate a dog", "Russian President Vladimir Putin ate a dog this morning as a part of a Russo-Korean referendum");

        NewsDB.addNews(news_1);
        DataBase.getNews(1);
        DataBase.deleteNews(1);

    }
}
