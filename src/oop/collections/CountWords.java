package oop.collections;

import java.util.HashMap;

public class CountWords {

    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        HashMap<String, Integer> wordCounts = new HashMap<>();

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Replacing dots and commas, and make it always lowercase
            word = word.replaceAll("\\.", "");
            word = word.replaceAll(",", "");
            word = word.toLowerCase();

            Integer count = wordCounts.get(word);
            if (count == null) {
                wordCounts.put(word, 1);
            } else {
                count = count + 1;
                wordCounts.put(word, count);
            }
        }

        // Print values on each separate line
        for (String key : wordCounts.keySet()) {
            Integer value = wordCounts.get(key);
            System.out.println(key + " : " + value);
        }
    }

}
