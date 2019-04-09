package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library");
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", LocalDate.of(1954, 03, 12));
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", LocalDate.of(1998, 4, 25));
        Book book3 = new Book("Game of Thrones", "George R.R. Martin", LocalDate.of(2005, 12, 9));
        Book book4 = new Book("Winnie the Pooh", "A.A. Milne", LocalDate.of(1918, 11, 14));
        Book book5 = new Book("Winter of the World", "Ken Follett", LocalDate.of(2004, 05, 19));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned library");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep cloned library");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book5);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
