package oop.strings;

public class StringBasics {

    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = new String("Hello World!");

        char[] arr = new char[]{'J', 'a', 'v', 'a'};
        String s3 = new String(arr);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        // Print string char-by-char in loop, charAt()
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i));
        }
        System.out.println("");

        s1.toUpperCase();

        // result is ignored, s1 the same
        System.out.println("s1 = " + s1);

        String s1u = s1.toUpperCase();
        System.out.println("s1u = " + s1u);

        String s1l = s1u.toLowerCase();
        System.out.println("s1l = " + s1l);

        String text = "The quick brown fox jumps over lazy dog.";
        boolean containsFox = text.contains("fox");
        System.out.println("containsFox = " + containsFox);

        int indexOfFox = text.indexOf("fox");
        System.out.println("indexOfFox = " + indexOfFox);

        // First word in text
        int indexOfThe = text.indexOf("The");
        System.out.println("indexOfThe = " + indexOfThe);

        // No such word in text
        int indexOfCake = text.indexOf("cheesecake");
        System.out.println("indexOfCake = " + indexOfCake);

        // (first) indexOf and lastIndexOf
        int firstIndexOfO = text.indexOf("o");
        int lastIndexOfO = text.lastIndexOf("o");
        System.out.println("firstIndexOfO = " + firstIndexOfO);
        System.out.println("lastIndexOfO = " + lastIndexOfO);

        // from index till end of origin
        String subs1 = text.substring(4);
        System.out.println("subs1 = " + subs1);

        // "cut" from origin from 4 till 19
        String subs2 = text.substring(4, 19);
        System.out.println("subs2 = " + subs2);

        String s5 = "   TEXT   ";
        System.out.print("|");
        System.out.print(s5);
        System.out.println("|");

        // Remove leading and trailing whitespaces from origin string
        s5 = s5.trim();
        System.out.print("|");
        System.out.print(s5);
        System.out.println("|");

        // Splits the original text by divider into array of strings
        String[] parts = text.split("fox");
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            System.out.println("part = " + part);
        }

        String[] cats = text.split("cat");
        if (cats == null) {
            System.out.println("Null!");
        } else {
            System.out.println("Length : " + cats.length);
            String strangeString = cats[0];
            System.out.println("strangeString = " + strangeString);
        }

        String[] normalCats = text.split("cat", -1);
        if (normalCats == null) {
            System.out.println("Null!");
        } else {
            System.out.println("Length : " + normalCats.length);
        }

    }

}
