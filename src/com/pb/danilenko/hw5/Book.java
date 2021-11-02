package com.pb.danilenko.hw5;

public class Book {

    private String title;
    private String author;
    private String age;

    public Book (String title, String author, String age) {
        this.title = title;
        this.author = author;
        this.age = age;
    }

    public String getTitle () {
        return title;
    }

    public String getAuthor () {
        return author;
    }

    public String getAge () {
        return age;
    }

    public void setAge (String age) {
        this.age = age;
    }
    public String getInfo() {
        return "{" +
                "НАЗВАНИЕ='" + title + '\'' +
                ", АВТОР='" + author + '\'' +
                '}';
    }

}
