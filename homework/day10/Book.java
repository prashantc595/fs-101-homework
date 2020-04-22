package com.xebia.fs101.day10;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private Genre genre;
    private Langauge langugue;
    private List<Comment> comments;

    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.langugue = builder.langugue;
    }

    public String getTitle() {
        return this.title;
    }

    public Langauge getLangugue() {
        return langugue;
    }

    public String getAuthor() {
        return author;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public List<Comment> getComments() {
        return new ArrayList<>(comments);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (genre != book.genre) return false;
        return langugue == book.langugue;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (langugue != null ? langugue.hashCode() : 0);
        return result;
    }

    public static class Builder {
        private String title;
        private String author;
        private Genre genre;
        private Langauge langugue;

        public Builder(String title) {
            this.title = title;
        }

        public Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder withLanguage(Langauge language) {
            this.langugue = language;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
