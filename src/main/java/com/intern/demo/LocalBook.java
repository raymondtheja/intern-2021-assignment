package com.intern.demo;

import lombok.*;


@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class LocalBook extends Book{
    private String store;

    public LocalBook(String author, String title, String store) {
        this.setAuthor(author);
        this.setTitle(title);
        this.store = store;
    }
}
