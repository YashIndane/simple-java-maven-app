package com.mycompany.app;

/**
 * build on multicloud!
 */
public class App
{

    private final String message = "HELLO BUILD WITH MAVEN!!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
