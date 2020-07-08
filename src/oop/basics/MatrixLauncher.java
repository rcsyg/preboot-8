package oop.basics;

public class MatrixLauncher {

    public static void main(String[] args) {
        int[][] example = new int[][]{
                {5,4,3},
                {4,0,4},
                {7,10,3}
        };
        Matrix3 matrix3 = new Matrix3(example);
        matrix3.printSelf();

        System.out.println("");

        int det = matrix3.calculateDeterminant();
        System.out.println("det = " + det);

        System.out.println("");

        matrix3.transpose();
        matrix3.printSelf();

        System.out.println("");

        matrix3.transpose();
        matrix3.printSelf();
    }

}
