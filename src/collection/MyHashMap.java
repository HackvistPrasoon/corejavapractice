package collection;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm  = new HashMap<>();
        hm.put("prasoon",32);
        String str = "prasoon";
        int hashcode = str.hashCode(); //-321961894
        System.out.println("hashcode "+hashcode);
        int hash = (hashcode) ^  (hashcode >>> 16); //321934187
        System.out.println("hash "+hash);
        int bucketListLength = 16;
        int index = (bucketListLength - 1) & hash;
        System.out.println("index "+index); // 5 index

        Class c = null;
    }
}
