package compractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurOfCharInString {
    public static void main(String[] args) {
        String desc = " hello how are you everything is fine or not";
        desc = desc.replaceAll("\\s", "");

        ArrayList<Character> charArray = new ArrayList<>();
        for (int i = 0; i < desc.length(); i++) {
            charArray.add(i, desc.charAt(i));
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < charArray.size(); i++) {
            if (!hm.containsKey(charArray.get(i))) {
                hm.put(charArray.get(i), Collections.frequency(charArray, charArray.get(i)));
            }
        }

        for (Map.Entry<Character, Integer> me : hm.entrySet()) {
            System.out.println("character " + me.getKey() + " occurance : " + me.getValue());
        }


    }
}
