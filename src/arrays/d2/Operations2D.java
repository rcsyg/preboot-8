package arrays.d2;

public class Operations2D {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {-4, 7, 1},
                {9, 2, -8},
                {0, 3, 3}
        };

        // Sum of array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int element = arr[i][j];
                sum += element;
            }
        }
        System.out.println("sum = " + sum);

        // Min of array elements
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int element = arr[i][j];
                if (element < min) {
                    min = element;
                }
            }
        }
        System.out.println("min = " + min);


        // sum of diagonal top-left -> bottom-right (easy)
        // arr[0][0] + arr[1][1] + arr[2][2]
        int sumDiag1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sumDiag1 += arr[i][i];
        }
        System.out.println("sumDiag1 = " + sumDiag1);

        // sum of diagonal bottom-left -> top-right (hard)
        // arr[0][2] + arr[1][1] + arr[2][0]
        int sumDiag2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int reverseIndex = arr.length - 1 - i;
            sumDiag2 += arr[i][reverseIndex];
        }
        System.out.println("sumDiag2 = " + sumDiag2);

    }

}
