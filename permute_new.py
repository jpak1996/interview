import copy
from pprint import pprint

"""
if string has length 1, return string
for range from 0 to length,
    insert the last character into the list of all possibilities

"""


def permute(list1, length):
    if length==1:
        return([list1])
    else:
        last_char = list1[length-1]
        new_length = length-1
        orig = permute(list1[0:length-1], new_length)
        final_list = []
        list_length = len(orig)
        for x in range(0,len(orig)):
            for i in range(0, length):
                base = copy.copy(orig[x])
                base.insert(i, last_char)
                final_list.append(base)
        return final_list
    
abc = 'abcd'
abc_list = list(abc)
res = permute(abc_list, 4)

pprint(res)
pprint(len(res))

# print(abc_list[0:0])
