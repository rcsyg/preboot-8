package oop.collections;

import java.util.HashMap;

public class Vocabulary {

    private HashMap<String, String> storage = new HashMap<>();

    public void addRecord(String key, String value) {
        // put passed key & value to a storage variable
        storage.put(key, value);
    }

    public String getRecordValue(String key) {
        // change return statement to return real value from storage
        String value = storage.get(key);
        return value;
    }

    public void print() {
        System.out.println(storage);
    }

}
