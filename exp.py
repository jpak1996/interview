

def exp(a,b):
	if b==0:
		return float(1)
	elif b>0:
		initial = float(a)
		for x in range(1,b):
			a = a*initial
	else:
		initial = float(a)
		a = 1/float(a)
		b = -b
		for x in range(1,b):
			a = a/initial
	return a
print(exp(2,0))
print(exp(2,4))
print(exp(-2,3))
print(exp(-2,4))
print(exp(2,-1))
print(exp(2,-3))
print(exp(2,10))
print(exp(2,-10))
