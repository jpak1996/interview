import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class is_unique {
  // public static boolean is_unique(String str) {
  //   int length = str.length();
  //   Set<Character> unique_chars = new LinkedHashSet<Character>();
  //   for(int i=0; i<length; i++) {
  //     if(unique_chars.contains(str.charAt(i))) {
  //       return false;
  //     }
  //     else {
  //       unique_chars.add(str.charAt(i));
  //     }
  //   }
  //   return true;
  // }
  public static boolean is_unique(String str) {
    boolean[] options = new boolean[128];
    // basic ascii table
    int length = str.length();
    for(int i=0; i<length; i++) {
      int val = str.charAt(i);
      if(options[val]) {
        return false;
      }
      else {
        options[val] = true;
      }
    }
    return true;
  }
  // public static boolean is_unique(String str) {
  //   int length = str.length();
  //   for(int i=0; i<length; i++) {
  //     for(int j=i+1; j<length; j++) {
  //       if(str.charAt(i)==str.charAt(j)) {
  //         return false;
  //       }
  //     }
  //   }
  //   return true;
  // }
  
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("asdfa");
    System.out.println(is_unique(strings.get(0)));
  }
}