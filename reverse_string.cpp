#include <iostream>
#include <cstring>
using namespace std;

// char* reverse(const char* cstring) {
//   int length = strlen(cstring);
//   char* res = (char*)malloc(sizeof(char));
//   int counter = 0;
//   for(int i=length-1; i>=0; i--) {
//     res[counter] = cstring[i];
//     res = (char*)realloc(res, (counter+2)*sizeof(char));
//     counter+=1;
//   }
//   res[counter] = '\0';
//   return res;
// }
// 
// int main() {
//   const char* a = "hello";
//   cout << reverse(a);
//   return 0;
// }

#include <iostream>
#include <cstring>
using namespace std;

void reverse(char *str) {
  char* end = str;
  char temp;
  while(*end!='\0') {
    end++;
  }
  end--;
  int length = strlen(str);
  int counter = 0;
  while(counter<length) {
    temp = *str;
    *str = *end;
    *end = temp;
    counter++;
    length--;
  }
}

// To execute C++, please define "int main()"
int main() {
  char a[] = {'a','b','\0'};
  reverse(a);
  cout << a;
  return 0;
}

