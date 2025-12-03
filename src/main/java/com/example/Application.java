package com.example;

public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to Multi-Branch Pipeline Application!");
        String branch = System.getenv("GIT_BRANCH");
        if (branch != null) {
            System.out.println("Running on branch: " + branch);
        } else {
            System.out.println("Running on local machine");
        }
    }

    public static String greet(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return "Hello, " + name + "!";
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
