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

    public int get(int idx) {
        if (idx < 0 || idx > index) {
            throw new IllegalArgumentException("Illegal index!");
        }
        return arr[idx];
    }

    public int size() {
        return index;
    }

    public void remove(int idx) {
        if (idx < 0 || idx > index) {
            throw new IllegalArgumentException("Illegal index!");
        }

        for (int i = idx; i < index; i++) {
            arr[i] = arr[i + 1];
        }
        index--;
    }

    public void addAll(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            add(value);
        }
    }


}
