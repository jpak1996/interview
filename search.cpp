#include <iostream>
using namespace std;

int search(int arr[], int target, int start, int end) {
  int mid = (start+end)/2;
  if (arr[mid] == target) {
    return mid;
  }
  else if (target < arr[mid]) {
    return search(arr, target, start, mid-1);
  }
  else {
    return search(arr, target, mid+1, end);
  }
}

int main(int argc, char* argv[]) {
  int arr[] = {1,2,3,4,5,6,7,8,9,10};
  int len = sizeof(arr)/sizeof(int);
  // cout << len;
  cout << search(arr, 7, 0, len-1);
}