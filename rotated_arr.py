# def find(arr, start, end):
#     if(start==end):
#         return arr[start]
#     else:
#         mid = (start+end)//2
#         if(arr[start]<arr[end]):
#             return find(arr, start, end-1)
#         else:
#             return find(arr, start+1, end)
#             
def binary_find(arr, start, end):
    if(start==end):
        return arr[start]
    else:
        mid = (start+end)//2
        if(arr[start] < arr[mid]):
            return min(arr[start], binary_find(arr, mid+1, end))
        else:
            return min(binary_find(arr, start, mid), binary_find(arr, mid+1, end))
            
if __name__ == "__main__":
    arr = [5,4,1,2,3]
    # arr = [3,4,5,1,2]
    length = len(arr)
    print(binary_find(arr,0,length-1))