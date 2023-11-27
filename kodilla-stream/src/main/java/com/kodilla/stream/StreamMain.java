package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> result = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> Period.between(user.getBirthDate(), LocalDate.now()).getYears() >= 20)
                .filter(user -> user.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println(result);
    }
}