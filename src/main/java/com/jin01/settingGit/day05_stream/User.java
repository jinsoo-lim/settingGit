package com.jin01.settingGit.day05_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    String name;
    int level;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public User(String name, int level) {
        this.name = name;
        this.level = level;
    }
}
