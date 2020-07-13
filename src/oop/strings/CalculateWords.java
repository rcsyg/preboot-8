package oop.strings;

import oop.AwesomeList;

public class CalculateWords {

    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        String wordToCount = "the";

        // Count the given word
        String[] thes = text.split("the");
        System.out.println("count = " + (thes.length - 1));

        // Count the given word (right way)
        int counter = 0;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // NEVER USE == !!!
            boolean equal = "the".equals(word);
            if (equal) {
                counter++;
            }
        }
        System.out.println("counter = " + counter);

        // Bonus : find all positions of word to find
        AwesomeList awesomeList = new AwesomeList();
        int indexOfWord = text.indexOf("the");
        while (indexOfWord != -1) {
            int previous = 0;
            if (awesomeList.size() != 0) {
                int lastIndex = awesomeList.size() - 1;
                previous = awesomeList.get(lastIndex);
            }
            awesomeList.add(previous + indexOfWord);
            text = text.substring(indexOfWord + 1);
            indexOfWord = text.indexOf("the");
        }
        awesomeList.printSelf();

    }

}
