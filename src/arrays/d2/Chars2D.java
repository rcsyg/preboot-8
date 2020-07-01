package arrays.d2;

public class Chars2D {

    public static void main(String[] args) {
        char[][] text = new char[][] {
                {'h', 'e', 'l', 'l', 'o'},
                {'w', 'o', 'r', 'l', 'd'},
                {'a', 'n', 'd'},
                {'J', 'a', 'v', 'a'}
        };

        // Change particular element
        text[0][0] = 'H';

        // Can not change length of array!
        // text[3][4] = '!';
        text[3] = new char[]{'J', 'a', 'v', 'a', '!'};

        // Print
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text[i].length; j++) {
                System.out.print(text[i][j]);
            }
            System.out.println("");
        }
    }

}
