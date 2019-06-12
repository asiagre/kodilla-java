package com.kodilla.hibernate.manytomany.facade;

public class SearchingException extends RuntimeException {
    public SearchingException() {
    }

    public SearchingException(String message) {
        super(message);
    }
}
