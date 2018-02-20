package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username = "John Smith";

    public String ForumUser(String username) {
        return username;
    }
}

