package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //todo declare variable
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String question;
        double number;


        //todo initialize
        System.out.println("This is Magic 8 Ball");
        System.out.println("What is your question?");
        question = keyboard.nextLine();
        System.out.println("Give me a number");
        number = keyboard.nextDouble();

        //todo conditional
        if (10>=number && number>0) {
            System.out.println("Most likely not");
        }
        else if (20>=number & number>10) {
            System.out.println("Most likely");
        }
        else if (30>=number & number>20) {
            System.out.println("Likely");
        }
        else if (40>=number & number>30) {
            System.out.println("NOT likely");
        }
        else if (50>=number & number>40) {
            System.out.println("Yes");
        }
        else if (60>=number & number>50) {
            System.out.println("Probably");
        }
        else if (70>=number & number>60) {
            System.out.println("Probably Not");
        }
        else if (80>=number & number>70) {
            System.out.println("Probably YES");
        }
        else if (90>=number & number>80) {
            System.out.println("You might");
        }
        else if (100>=number & number>90) {
            System.out.println("You might NOT");
        }

    }
}
