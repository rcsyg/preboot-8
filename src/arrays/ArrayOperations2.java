package arrays;

public class ArrayOperations2 {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 8, -3, 5, 2, 12};

        // 4  8 -3  5 2 12
        // 8 16 -6 10 4 24

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            element = element * 2;
            arr[i] = element;
        }

        // just printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] arr2 = new int[]{9, -5, -7, 0, 31, 4};


        int[] arr3 = new int[arr.length];

        // Just print arr3
        System.out.println("\n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        // Sum from arr and arr2
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr[i] + arr2[i];
        }

        // Print arr3 again
        System.out.println("\n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        // 17 11 -13 10 35 28
        // 28 35 10 -13 11 17
        // Print in reverse

        System.out.println("\n");
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i] + " ");
        }

        // Same but with calculating index
        System.out.println("\n");
        for (int i = 0; i < arr3.length; i++) {
            int reverseIndex = arr3.length - 1 - i;
            System.out.print(arr3[reverseIndex] + " ");
        }

        arr = new int[]{4, 8, -3, 5, 2, 12};
        arr2 = new int[]{9, -5, -7, 0, 31, 4};
        // 4 + 4; 8 + 31; -3 + 0 ...

        for (int i = 0; i < arr3.length; i++) {
            int reverseIndex = arr2.length - 1 - i;
            arr3[i] = arr[i] + arr2[reverseIndex];
        }

        System.out.println("\n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

}
