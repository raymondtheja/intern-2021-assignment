package com.intern.demo;

import lombok.*;


@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ImportedBook extends Book{
    private String translator;

    public ImportedBook(String author, String title, String translator) {
        this.setAuthor(author);
        this.setTitle(title);
        this.translator = translator;
    }
}
