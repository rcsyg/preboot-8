package oop.strings;

public class CapitalizeEachSecondWord {

    public static void main(String[] args) {
        String text = "The quick brown fox jumps over lazy dog.";

        // Capitalize each second word (starting from 0)
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i % 2 == 0) {
                word = word.toUpperCase();
            }
            System.out.print(word + " ");
        }

    }

}
