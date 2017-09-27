
class replace_spaces {
  // public static String replace_spaces(String orig) {
  //   char[] charArray = orig.toCharArray();
  //   StringBuilder sb = new StringBuilder();
  //   for (char c : charArray) {
  //     if(c==' ') {
  //       sb.append("%20");
  //     }
  //     else {
  //       sb.append(c);
  //     }
  //   }
  //   
  //   String res = sb.toString();
  //   return res;
  // }
  
  public static char[] replace_spaces(char[] orig) {
    int initial_length = orig.length;
    int final_length = initial_length;
    
    for(char c: orig) {
      if(c==' ') {
        final_length += 2;
      }
    }
    System.out.println(final_length);
    char[] final_arr = new char[final_length];
    int pos = 0;
    for(int i=0; i<initial_length; i++) {
      if(orig[i]==' ') {
        final_arr[pos+0] = '%';
        final_arr[pos+1] = '2';
        final_arr[pos+2] = '0';
        pos+=3;
      }
      else {
        final_arr[pos] = orig[i];
        pos+=1;
      }
    }
    return final_arr;
  }

  public static void main(String[] args) {
    String orig = "  aa";
    char[] arr = orig.toCharArray();
    char[] res = replace_spaces(arr);
    System.out.println(res);
    
  }
}