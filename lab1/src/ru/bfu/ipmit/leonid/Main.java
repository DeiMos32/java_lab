package ru.bfu.ipmit.Leonid;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String greeting = "Hello, Leonid!";
        String sha256hex = Hashing.sha256()
                .hashString(greeting, StandardCharsets.UTF_8)
                .toString();
        System.out.println(sha256hex);
    }
}
