package arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 8, -3, 5, 2, 12};
        // -3 2 4 5 8 12

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                int element = arr[j];
                if (element < min) {
                    min = element;
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
