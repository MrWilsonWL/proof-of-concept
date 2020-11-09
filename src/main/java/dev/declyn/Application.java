package dev.declyn;

import java.util.Scanner;
import java.util.Set;

/*
 * JDK: 11
 * Proof of concept for workflow
 * For this proof of concept, I'll be using SDD 8 (Fixed Loops)
 */
public class Application {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Input a number to loop through");

        if (!scanner.hasNextInt()) {
            System.out.println("You must provide a valid integer.");
            return;
        }

        //Holding scanner.nextInt() in the loop will require a new integer each time, so hold an instance of the number instead..

        int maxLoop = scanner.nextInt();
        for (int i = 0; i < maxLoop; i++) {
            System.out.println(i);
        }

        lineBreak();

        var array = Set.of(2, 4, 6, 8, 10);

        System.out.println("Pritnting array: " + array.toString());

        for (Integer integer : array) {
            System.out.println(integer);
        }

        //In an array, an integer is provided as the object type because <T> types cannot hold primitive types

        scanner.close();
    }

    private static void lineBreak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("");
        }
    }

}