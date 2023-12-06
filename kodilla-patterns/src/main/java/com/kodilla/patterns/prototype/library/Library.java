package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library implements Cloneable {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public Library clone() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return this.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = this.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book book : books) {
            Book clonedBook = new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }
}