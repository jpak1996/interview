import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class remove_duplicates {
  // public static void remove_dups(char[] orig) {
  //   boolean exist[] = new boolean[256];
  //   int len = orig.length;
  //   if (len<2) {
  //     return;
  //   }
  //   for(int i=0; i<256; i++) {
  //     exist[i] = false;
  //   }
  //   int new_len = 0;
  //   for(int i=0; i<len; i++) {
  //     int val = orig[i];
  //     if (exist[val]!=true) {
  //       orig[new_len] = orig[i];
  //       new_len++;
  //       exist[val] = true;
  //     }
  //   }
  //   for(int a=new_len; a<len; a++) {
  //     orig[a] = 0;
  //   }
  //   System.out.println(orig);
  // }
  public static String remove_dups(String str) {
    int len = str.length();
    StringBuilder sb = new StringBuilder();
    if (len<2) {
      return "";
    }
    boolean exist[] = new boolean[256];
    for(int i=0; i<256; i++) {
      exist[i] = false;
    }
    for(int i=0; i<len; i++) {
      int val = str.charAt(i);
      if (exist[val]!=true) {
        sb.append(str.charAt(i));
        exist[val] = true;
      }
    }
    return sb.toString();
  }
  
  // public static String remove_duplicates(String orig) {
  //   int length = orig.length();
  //   Set<Character> unique_chars = new LinkedHashSet<Character>();
  //   for(int i=0; i<length; i++) {
  //     unique_chars.add(orig.charAt(i));
  //   }
  //   StringBuilder s = new StringBuilder();
  //   for(char c : unique_chars) {
  //     s.append(c);
  //   }
  //   return s.toString();
  // }
  // public static void main(String[] args) {
  //   ArrayList<String> strings = new ArrayList<String>();
  //   String a = "Hello, World!";
  //   // System.out.println(a);
  //   System.out.println(remove_duplicates(a));
  // }
  public static void main(String[] args) {
    String a = "hithere";
    String sb = remove_dups(a);
    System.out.println(sb);
  }
}