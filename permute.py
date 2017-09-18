# def permute(string):
#     if len(string) == 1:
#         print(string)
#         return string
#     else:
#         # print(string[0:1] + permute(string[1:]))
#         return string[0:1] + permute(string[1:])
#     
# string = 'abc'
# res = permute(string)
# print(res)

def permute(string):
    length = len(string)
    temp = ''
    print(string[0])
    string[0] = 'z'
    print(string)
    # for x in range(0, length):
    #     for y in range(x, length):
    #         temp1 = string[x]
    #         temp2 = string[y]
    #         string[x] = temp2
    #         string[y] = temp1
    #         print(string)
permute('abc')