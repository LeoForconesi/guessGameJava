package com.leo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        generateRandomNumber();
    }

    static void generateRandomNumber() {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(40);
        int numberOfTries = 0;
        Boolean win = false;
        int guess;
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Guess the number between 0 and 40.");

        while(!win) {
            guess = input.nextInt();  // Read user input nextLine
            numberOfTries ++;
            if (guess == numberToGuess) {
                win = true;
                System.out.println("Correct! you guessed in " + numberOfTries + " tries.");
            } else if (guess > numberToGuess) {
                System.out.println("It's lower than" + guess);
                numberOfTries ++;
            } else if (guess < numberToGuess) {
                System.out.println("It's greater than" + guess);
                numberOfTries ++;
            }
        }
    }
}
