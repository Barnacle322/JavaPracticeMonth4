package com.company;

import java.util.Date;

public class News {
    private int id;
    private String title;
    private String text;
    private Date time_published;

    public News(){}

    public News(String title, String text){
        this.title = title;
        this.text = text;
    }

    public News(int id, String title, String text, Date time_published) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.time_published = time_published;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getTime_published() {
        return time_published;
    }

    public void setTime_published(Date time_published) {
        this.time_published = time_published;
    }

    @Override
    public String toString() {
        String msg = String.format("%s%n%n%s", this.title, this.text);
        return msg;
    }
}

