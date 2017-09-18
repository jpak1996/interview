#include <iostream>
#include <vector>

using namespace std;

vector<string> permute(string str) {
  int len = str.length();
  vector<string> res;
  res.push_back(str);
  if (len==1) {
    return res;
  }
  else {
    string first_part = str.substr(0, len-1);
    vector<string> base = permute(first_part);
    int list_size = base.size();
    string last_str = str.substr(len-1, 1);
    vector<string> res;
    string temp = "";
    
    // a
    // ab -> ab, ba
    
    for(int j=0; j<list_size; j++) {
      for(int i=0; i<len; i++) {
        temp = base[j];
        temp.insert(i, last_str);
        res.push_back(temp);
      }
    }
    return res;
  }
}

int main(int argc, char* argv[]) {
  string s = "abc";
  vector<string> res = permute(s);
  for(vector<string>::iterator it=res.begin(); it!=res.end(); ++it) {
    cout << *it << endl;
  }
  cout << res.size() << endl;
  
}