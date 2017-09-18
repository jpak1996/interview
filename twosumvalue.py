def twosum(arr, target):
	dict = {}
	length = len(arr)
	for x in range (0, length):
		dict[arr[x]] = x
	for x in range(0, length):
		if target-arr[x] in dict.keys():
			return [arr[x], target-arr[x]]

arr = [4,2,6,3,12,5,19,4,11,3,3,8]
print(twosum(arr,15))
