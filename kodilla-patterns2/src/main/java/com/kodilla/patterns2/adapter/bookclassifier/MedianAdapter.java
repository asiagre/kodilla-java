package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        if(bookSet.isEmpty()) {
            return 0;
        }
        Map<BookSignature, BookB> books = new HashMap<>();
        bookSet.forEach(book -> books.put(new BookSignature(book.getSignature()), new BookB(book.getAuthor(), book.getAuthor(), book.getPublicationYear())));
        return medianPublicationYear(books);
    }
}
