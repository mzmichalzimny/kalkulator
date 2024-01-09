package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Title1", 2000, "1"));
        bookSet.add(new Book("Author2", "Title2", 2002, "2"));
        bookSet.add(new Book("Author3", "Title3", 2004, "3"));
        bookSet.add(new Book("Author4", "Title4", 2006, "4"));
        bookSet.add(new Book("Author5", "Title5", 2008, "5"));
        Classifier classifier = new MedianAdapter();
        //When
        int median = classifier.publicationYearMedian(bookSet);
        //Then
        assertEquals(2004, median);
    }
}