public static int search(int arr[], int target, int start, int end) {
  int mid = (start + end)/2;
  if (arr[mid] == target) {
    return arr[mid];
  }
  else if (target < arr[mid]) {
    search(arr[], target, start, mid-1);
  }
  else {
    search(arr[], target, mid+1, end);
  }
}

public static void main(String args[]) {
  int arr[] = [1,2,3,4,5,6,7,8,9,10];
  int len = arr.length();
  System.println(search(arr, len, 0, len-1));
}