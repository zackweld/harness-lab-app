package com.example.lab;

public final class Greeter {
    private Greeter() {}

    public static String message(String version) {
        return "Hello from the Harness lab app, version " + version + "\n";
    }
}
