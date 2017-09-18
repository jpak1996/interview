def reverseint(start):
	modulo = 10
	divider = 1
	res = 0
	remainder = 0
	while(res<start):
		remainder = start % modulo
		res = 10*res + (remainder/divider)
		modulo *= 10
		divider *= 10
	return res
print(reverseint(1234))
