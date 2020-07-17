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

            String[] arguments = userInput.split(" ");
            String command = arguments[0];

            switch (command) {
                case "add":
                    String key = arguments[1];
                    String value = arguments[2];
                    vocabulary.addRecord(key, value);
                    System.out.println("Record added!");
                    break;
                case "get":
                    String keyToGet = arguments[1];
                    String recordedValue = vocabulary.getRecordValue(keyToGet);
                    System.out.println("Value is: " + recordedValue);
                    break;
                case "print":
                    vocabulary.print();
                    break;
                case "exit":
                    System.out.println("Thanks for using!");
                    break;
            }
        }


        scanner.close();
    }

}
