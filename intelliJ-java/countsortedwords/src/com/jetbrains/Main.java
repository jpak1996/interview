package com.jetbrains;
import java.util.*;

public class Main {
    public static TreeMap<String, Integer> count(String input) {
        TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();
        String[] words = input.split("\\W");
        for(String w : words) {
            if(hmap.containsKey(w)) {
                int a = hmap.get(w);
                hmap.replace(w, a+1);
            }
            else {
                hmap.put(w, 1);
            }
        }
        return hmap;
    }
    public static void main(String[] args) {
        // write your code here
        String input = "four score and four years ago ago four and score years i am";
        TreeMap<String, Integer> res = count(input);
        String[] buf = new String[res.size()];
        int counter = 0;
        for(Map.Entry<String, Integer> entry: res.entrySet()) {
            String key = entry.getKey();
            Integer i = entry.getValue();
            buf[counter] = i + " " + key;
            counter++;
        }
        Arrays.sort(buf);
        for(int i=buf.length-1; i>=0; i--) {
            System.out.println(buf[i]);
        }

    }
}
