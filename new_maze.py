import time
import string
import sys
import copy
"""

given a 2-d rectangular array, find if a path exists from up/left corner to down/right corner.
list the coordinates of the path you took to get to the solution.

e.c. if possible, list the shortest path possible.

#############
psuedocode:
    if x and y are respectively equal to width and height, then you are at the end.
    return the 'stack,' which should contain all the coordinates up to this point.
    
    if not, then run the function incrementing up, down, left, and right.
    
    if there is only one way to go (ex: down), then store that path.
    return the stack that kept track of the nodes you visited.
    
    if there is a junction and there are multiple ways to go, store all those paths.
    take the smallest value of those paths and return the min path.
    
    mark each spot as visited so the recursion doesn't loop infinitely

    have a stack keeping track of the position traversed thus far.
"""


def solve(matrix, pos, stack):

    width = len(matrix[0])
    height = len(matrix)
    x = pos[1]
    y = pos[0]
    # mark it as visited
    matrix_copy = copy.deepcopy(matrix)
    matrix_copy[y][x] = 2
    stack_copy = copy.deepcopy(stack)
    stack_copy.append([y,x])
    up = None
    down = None
    left = None
    right = None
    # for row in matrix_copy:
    #     print(row)
    # print
    if x == width-1 and y == height-1:
        # print(stack_copy)
        matrix[y][x] = 2
        return stack_copy
    else:
        dead_end = 1
        
        # down
        if y+1>=0 and y+1<height and matrix_copy[y+1][x] == 0:
            dead_end = 0
            down = solve(matrix_copy, [y+1,x], stack_copy)
            
        # right
        if x+1>=0 and x+1<width and matrix_copy[y][x+1] == 0:
            dead_end = 0
            right = solve(matrix_copy, [y,x+1], stack_copy)
            
        # up
        if y-1>=0 and y-1<height and matrix_copy[y-1][x] == 0:
            dead_end = 0
            up = solve(matrix_copy, [y-1,x], stack_copy)
            
        # left
        if x-1>=0 and x-1<width and matrix_copy[y][x-1] == 0:
            dead_end = 0
            left = solve(matrix_copy, [y,x-1], stack_copy)
            
        if dead_end == 0:
            path_list = [up,down,left,right]
            min_length = 999

            min_path = []
            for path in path_list:
                if path:
                    if len(path) < min_length and len(path)!=0:
                        min_path = copy.deepcopy(path)
                        min_length = len(path)
            if len(min_path)!=0:
                return min_path
            
        else:
            return None

file1 = open('./maze2.txt', 'r')
matrix = []

for line in file1:
    stringline = string.rstrip(line)
    strnums = stringline.split(' ')
    templist = []
    for strnum in strnums:
        templist.append(int(strnum))
    matrix.append(templist)

solution = (solve(matrix, [0,0], []))
width = len(matrix[0])
height = len(matrix)

for row in range(0, height):
    for col in range(0, width):
        if solution.count([row, col])!=0:
            matrix[row][col] = 7
            
for row in matrix:
    print(row)

print
print(solution)