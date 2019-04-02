package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String userame;

    public ForumUser() {
        this.userame = "John Smith";
    }

    public String getUserame() {
        return userame;
    }
}
