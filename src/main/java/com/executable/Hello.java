package com.executable;

public class Hello {

    public static void main(String[] args) {
        
        if (args.length != 2) {
            throw new IllegalStateException("Enter your name and location, please.");
        }

        System.out.printf("Hello %s from %s%n", args[0], args[1]);
    }
}
