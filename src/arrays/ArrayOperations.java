package arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 8, -3, 5, 2, 12};
        // [4][8][-3][5][2][12]
        //  0  1   2  3  4   5

        for (int i = 0; i < arr.length; i++) {
            //int element = arr[i];
            //System.out.print(element + " ");

            System.out.print(arr[i] + " ");
        }

        // sum of arr[] elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            sum = sum + element;
        }

        System.out.println("sum = " + sum);
    }

}
