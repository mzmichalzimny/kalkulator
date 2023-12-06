package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() throws CloneNotSupportedException {
        //Given
        Library library = new Library("Biblioteka 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Tytuł " + n, "Autor " + n, LocalDate.now())));

        //Making a shallow copy of object library
        Library clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Biblioteka 2");

        //Making a deep copy of object library
        Library deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Biblioteka 3");

        //When
        library.getBooks().removeAll(library.getBooks());

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(0, library.getBooks().size());
        assertEquals(0, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}