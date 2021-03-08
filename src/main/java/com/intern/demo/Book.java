package com.intern.demo;

import lombok.Data;

@Data
public class Book {
    private String author;
    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
}
