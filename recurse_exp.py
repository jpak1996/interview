def exp(a,b):
	if b == 0:
		return 1
	elif b == 1:
		return a
	else:
		half = exp(a, b/2)
		if b%2 == 0:
			return half*half
		else:
			return a*half*half
print(exp(2,3))
print(exp(2,5))
print(exp(2,8))
print(exp(3,5))
print(exp(2,10))
