package oop.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StudentMarks {

    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> studentMarks = new HashMap<>();
        studentMarks.put("Vasya Pupkin", new ArrayList<>(Arrays.asList(4, 5, 4, 5, 1, 6, 5, 4)));
        studentMarks.put("Janis Berzins", new ArrayList<>(Arrays.asList(7, 4, 8, 9, 6, 10, 10, 2)));
        studentMarks.put("Pupka Vasykin", new ArrayList<>(Arrays.asList(9, 10, 10, 10, 9)));

        // Store calculated results here
        HashMap<String, Double> studentAverages = new HashMap<>();


    }

}
