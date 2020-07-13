package oop.strings;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        // jOhN lemOn   HooK

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name & surname:");
        String userInput = sc.nextLine();
        sc.close();

        userInput = userInput.trim();

        String[] words = userInput.split(" ");

        String userName = words[0];
        String firstNameLetter = userName.substring(0, 1);
        String remainingNameLetters = userName.substring(1);

        firstNameLetter = firstNameLetter.toUpperCase();
        remainingNameLetters = remainingNameLetters.toLowerCase();

        String formattedFirstName = firstNameLetter + remainingNameLetters;

        String surname = "";
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                word = word.toUpperCase();
                surname += (word + "-");
            }
        }

        // Remove last symbol ( "-" )
        surname = surname.substring(0, surname.length() - 1);

        String fullName = "'" + formattedFirstName + " " + surname + "'";
        System.out.println(fullName);

    }

}
