package com.jin01.settingGit.day05_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("alice", 10),
                new User("Bob", 26),
                new User("chaly",30),
                new User("david", 15)
        );

        List<String> result = users.stream()
                .filter(user -> user.getLevel()>=20)
                .map(user -> user.getName())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
