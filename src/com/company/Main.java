package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /*Given an array of non-empty strings, return a Map<String, String> with a key for every different
         first character seen, with the value of all the strings starting with that character appended
         together in the order they appear in the array.


        firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
        firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
        firstChar([]) → {}*/
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string: strings) {
            if (!map.containsKey(getFirstLetter(string))){
                map.put(getFirstLetter(string),string);
            } else{
                map.replace(getFirstLetter(string),map.get(getFirstLetter(string)) + string);
            }
        }
        return map;
    }
    public String getFirstLetter(String string) {
        return String.valueOf(string.charAt(0));
    }
}
