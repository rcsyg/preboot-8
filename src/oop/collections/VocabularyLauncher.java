package oop.collections;

import java.util.Scanner;

public class VocabularyLauncher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vocabulary vocabulary = new Vocabulary();

        String userInput = "";

        while (!userInput.equals("exit")) {
            System.out.println("Enter command and parameters: ");
            userInput = scanner.nextLine();

            // here need to split user input on command and parameters,
            // process commands, delegating execution to Vocabulary class
            // e.g. add en Cat should call vocabulary.add("en", "Cat")
            // please write code below (but inside while loop) :

        }


        scanner.close();
    }

}
