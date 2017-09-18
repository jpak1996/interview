#include <iostream>

using namespace std;

// public:
void swap(char* a, char* b) {
  char temp = *a;
  a = b;
  *b = temp;
}

void permute(string str, int start, int end) {
  if(start == end) {
    cout << str << endl;
  }
  // else {
  //   for(int i=start; i<=end; i++) {
  //     swap(str[start], str[i]);
  //     permute(str, start+1, end);
  //     swap(str[start], str[i]);
  //   }
  // }
    
  else {
    for(int i=start; i<=end; i++) {
      swap(str[start], str[i]);
      permute(str, start+1, end);
      // swap(str[start], str[i]);
    }
  }
    
}
// class Math {
//   public:
//     
//   
// }

int main(int argc, char* argv[]) {
  string a = "ab";
  permute(a, 0, a.length()-1);
  // started at 4:55
  // went for 2 minutes, comp is heating up
  // stopped at 'abcdefghijklmnoytxwuqvszpr'
}