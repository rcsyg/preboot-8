package arrays.d2;

public class Arrays2D {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};

        int[][] arr2d = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7}
        };

        int[][] arr2dExtra = new int[][]{
                {4},
                // 8, -- won't compile
                {-3},
                {5},
                {2, 7, 9, -5, 6},
                {12}
        };

        // arr2d 2 & 4 ; 5 & 7
        System.out.println(arr2d[0][1] + " " + arr2d[0][3]);
        System.out.println(arr2d[1][0] + " " + arr2d[1][2]);

        // 1D array case
        int some = arr[3];

        // Simple row (1D array) of 2D array
        int[] row = arr2d[1];

        // Particular element
        int element = arr2d[1][1];

        System.out.println("arr2d.length = " + arr2d.length);

        // How to print 2D array
        for (int i = 0; i < arr2d.length; i++) {
            int[] innerRow = arr2d[i];
            for (int j = 0; j < innerRow.length; j++) {
                int elem = innerRow[j];
                System.out.print(elem + " ");
            }
            System.out.println("");
        }

        System.out.println("\n");

        // Same, but short form
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
