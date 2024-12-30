// Hashtable = A data structure that stores unique keys to values
// Each key/value pair is known as an Entry
// FAST insertion, look up, deletion of key/value pairs
// Not ideal for small data sets, great with large data sets

//  ===> map (K, V) ===> HashMap, TreeMap, LinkedHashMap, ConcurrentHashMap
// Collusion is when two keys map to the same value
// To handle collisions, we use a technique called "separate chaining" or "open addressing"
// chaining: Each bucket in the HashMap contains a linked list of Entry objects

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);

        System.out.println(hashMap.get("apple")); // Output: 1
        System.out.println(hashMap.get("banana")); // Output: 2
        System.out.println(hashMap.get("cherry")); // Output: 3

        // Checking if a key exists in the HashMap
        System.out.println(hashMap.containsKey("apple")); // Output: true
        System.out.println(hashMap.containsKey("grape")); // Output: false

        // Removing a key-value pair from the HashMap
        hashMap.remove("banana");
        System.out.println(hashMap.get("banana")); // Output: null
        System.out.println(hashMap.containsKey("banana")); // Output: false
        System.out.println(hashMap.size()); // Output: 2
        // Clearing all key-value pairs from the HashMap
        hashMap.clear();
        System.out.println(hashMap.isEmpty()); // Output: true
        System.out.println(hashMap.size()); // Output: 0
        // Adding multiple key-value pairs to the HashMap
        hashMap.putAll(new HashMap<String, Integer>() {{
            put("orange", 4);
            put("kiwi", 5);
        }});
        System.out.println(hashMap.get("orange")); // Output: 4
        System.out.println(hashMap.get("kiwi")); // Output: 5
        // Checking if a key exists in the HashMap after adding multiple entries
        System.out.println(hashMap.containsKey("orange")); // Output: true
        System.out.println(hashMap.containsKey("grape")); // Output: false
        // Iterating over the key-value pairs in the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
        // Iterating over the values in the HashMap
        for (Integer value : hashMap.values()) {
            System.out.println("Value: " + value);
        }
        // Iterating over the key-value pairs in the HashMap using entrySet()
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}