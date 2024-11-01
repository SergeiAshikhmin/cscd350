package com.example.demo1;

public class CLI {

    public static void main(String[] args) {
        System.out.println("Hello to our UML Editor");
        System.out.print("What is your name? : ");
        String userInput = System.console().readLine();
        System.out.println("Your name is: " + userInput);
    }
}
