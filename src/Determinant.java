public class Determinant {

    public static void main(String[] args) {
        int[][] m = new int[][] {
                {-1, 2, 5},
                {7, -4, 3},
                {-5, 0, 10}
        };

        int determinant = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) -
                m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) +
                m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        System.out.println("determinant = " + determinant);
    }

}
