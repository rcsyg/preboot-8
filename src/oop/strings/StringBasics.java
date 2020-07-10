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


    }

}
