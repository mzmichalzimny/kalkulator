package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        // Dodaj użytkowników do forum tutaj...

        Map<Integer, ForumUser> result = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> LocalDate.now().getYear() - user.getBirthDate().getYear() >= 20)
                .filter(user -> user.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println(result);
    }
}