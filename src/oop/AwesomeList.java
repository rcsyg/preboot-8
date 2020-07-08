package oop;

public class AwesomeList {

    private int[] arr = new int[1];
    private int index = 0;

    public void add(int value) {
        if (index < arr.length) {
            arr[index] = value;
            index++;
        } else {
            int[] new_arr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                new_arr[i] = arr[i];
            }
            arr = new_arr;
            add(value);
        }
    }

    public void printSelf() {
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
