package com.example;

public class HelloApp {

    public static String createGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            name = "nieznajomy";
        }
        return "Witaj, " + name + "!";
    }

    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "nieznajomy";
        System.out.println(createGreeting(name));
    }
}
