package Loops.src;

import java.util.Scanner;

public class name {
    //Take name as input and print a greeting message for that particular name
    public static void main(String[] args) {
        System.out.println("Write your name:");
        Scanner input = new Scanner(System.in);
        String n = input.next();
        System.out.println("Hello " + n + " I welcome you to our corporation.");

    }
}
