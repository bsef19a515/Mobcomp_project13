package com.example.myapplication12;

public class Book {
    public String name;
    public String author;
    public int imageID;

    public Book(String name, String author, int imageID) {
        this.name = name;
        this.author = author;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getAuthor() {
        return author;
    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }

    public int getImageID() {
        return imageID;
    }

//    public void setImageID(int imageID) {
//        this.imageID = imageID;
//    }
}