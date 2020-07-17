package oop.util;

public class Conversions {

    public static void main(String[] args) {
        String s = "5";
        int sInt = Integer.parseInt(s);
        sInt++;

        System.out.println("sInt = " + sInt);

        String s2 = "3.14";
        double pi = Double.parseDouble(s2);
        System.out.println("pi = " + pi);

        String convertedBack = String.valueOf(sInt);
        System.out.println("convertedBack = " + convertedBack);

        String fail = "25 ";
        Integer.parseInt(fail);
    }

}
