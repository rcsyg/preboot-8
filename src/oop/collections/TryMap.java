package oop.collections;

import java.util.HashMap;
import java.util.Set;

public class TryMap {

    public static void main(String[] args) {

        // Map<String, String> declaration
        HashMap<String, String> catVocabulary = new HashMap<>();

        // Add values in Map
        catVocabulary.put("en", "Cat");
        catVocabulary.put("lv", "\u2B50 Kakis \u2B50");

        // Get value by existing key
        String catInLatvian = catVocabulary.get("lv");
        System.out.println("catInLatvian = " + catInLatvian);

        // Get value by non-existing key
        String catWithoutAKey = catVocabulary.get("no");
        System.out.println("catWithoutAKey = " + catWithoutAKey);
        if (catWithoutAKey == null) {
            System.out.println("No value was stored for key!");
        } else {
            System.out.println("value was stored :" + catWithoutAKey);
        }

        // Put value for key "no" and try to get & print one more time
        catVocabulary.put("no", "Kott");
        String catInNorwegian = catVocabulary.get("no");
        System.out.println("catInNorwegian = " + catInNorwegian);

        catVocabulary.put("jp", "Neko");

        System.out.println("");

        // Iterate over collection
        Set<String> keySet = catVocabulary.keySet();
        for (String key : keySet) {
            String value = catVocabulary.get(key);
            System.out.println(key + " : " + value);
        }

        System.out.println("");

        // Same, but more compact
        for (String key : catVocabulary.keySet()) {
            String value = catVocabulary.get(key);
            System.out.println(key + " : " + value);
        }

        System.out.println("");

        // Try to add with existing key & print in short form
        catVocabulary.put("no", "Kotye");
        System.out.println(catVocabulary);
        // VALUE OVERRIDE!


    }

}
