package org.example;
import java.util.Optional;

public class A2 {
    public static void main(String[] args) {
        String text = null;
        int length = Optional.ofNullable(text)
                .map(String::length)
                .orElse(5);
        System.out.println(length);
    }
}
