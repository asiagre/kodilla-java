package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("J.R.R. Tolkien", "The lord of the rings", 1954, "A0000"));
        bookSet.add(new Book("Ken Follet", "Winter of the world", 2012, "A0001"));
        bookSet.add(new Book("Diana Gabaldon", "Outlander", 1991, "A0002"));
        bookSet.add(new Book("George R.R. Martin", "A game of thrones", 1996, "A0003"));
        bookSet.add(new Book("Helen Fielding", "Bridget Jones's diary", 1997, "A0004"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int medianPublicationYear = medianAdapter.publicationYearMedian(bookSet);
        System.out.println(medianPublicationYear);

        //Then
        Assert.assertEquals(1996, medianPublicationYear);
    }

}