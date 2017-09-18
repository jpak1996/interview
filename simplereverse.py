def reverse(input):
	reversed = 0
	start = input
	while(start!=0):
		reversed = reversed*10 + start%10
		start = start/10
	return reversed
print(reverse(1234))
