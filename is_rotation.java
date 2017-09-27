class is_rotation {
  
  /*
  method isSubstring to check if a word is a substring of another.
  use it once to see if a string has been rotated.
  
  rotated string: is made up of two substrings of the original.
  waterbottle -> erbottlewat -> erbottle + wat
  */
  
  // public static boolean is_substring(char[] str1, char[] str2) {
  //   String s1 = new String(str1);
  //   String s2 = new String(str2);
  //   int length = s1.length();
  //   // length of char vs length of str
  //   String sub = s2;
  //   if (s1.length() != s2.length()) {
  //     return false;
  //   }
  //   for(int i=0; i<length; i++) {
  //     if(s1.contains(sub)) {
  //       return true;
  //     }
  //     sub = sub.substring(length-1, length) + sub.substring(0,length-1);
  //   }
  //   return false;
  //   
  // }
  
  // public static boolean is_rotation(char[] str1, char[] str2) {
  //   String s1 = new String(str1);
  //   String s2 = new String(str2);
  //   
  //   
  //   if (str1.length == str2.length) {
  //     String full = s1 + s1;
  //     if (s2.is_substring(full)) {
  //       return true;
  //     }
  //   }
  //   return false;
  // }
  public static void main(String[] args) {
    char[] str1 = {'w','a','t','e','r'};
    char[] str2 = {'t','e','r','w','a'};
    // System.out.println(is_rotation(str1, str2));
    System.out.println(str1.length);
    
  }
  
}