
def is_anagram(str1, str2):
    hmap = {}
    for char in str1:
        if char in hmap.keys():
            hmap[char] = hmap[char] + 1
        else:
            hmap[char] = 1
    print(hmap)
    for char in str2:
        if char in hmap.keys():
            hmap[char] = hmap[char] - 1
        else:
            print('f!')
            return False
    print(hmap)
    for key in hmap:
        if hmap[key] != 0:
            print('f')
            return False
    print('t!')
    return True

def sort_is_anagram(str1, str2):
    lst1 = []
    lst2 = []
    for char in str1:
        lst1.append(char)
    for char in str2:
        lst2.append(char)
    print(lst1)
    print(lst2)
    if lst1.sort() == lst2.sort():
        print('t')
        return True
    else:
        print('f')
        return False
    
str1 = 'eleven plus one is two'
str2 = 'twelve plus one is one'
sort_is_anagram(str1, str2)