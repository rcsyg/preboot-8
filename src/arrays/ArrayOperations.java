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

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            if (element > max) {
                max = element;
            }
        }

        System.out.println("max = " + max);

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            if (element < min) {
                min = element;
            }
        }

        System.out.println("min = " + min);

        int indexOfNumber = -1;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == 5) {
                indexOfNumber = i;
                break;
            }
        }

        System.out.println("indexOfNumber (5) = " + indexOfNumber);

        // count how much positive values (incl. 0) and negative we have in given array

        int positives = 0;
        int negatives = 0;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element >= 0) {
                //positives = positives + 1;
                positives++;
            } else {
                negatives++;
            }
        }

        System.out.println("positives = " + positives);
        System.out.println("negatives = " + negatives);
    }

}
