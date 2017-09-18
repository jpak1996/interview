import string
import copy
from collections import deque

"""
problem:
    1. given a rectangular matrix, find 

"""


class pos:
    x = None
    y = None
    parent = None
    def __init__(self,x,y,parent):
        self.x = x
        self.y = y
        self.parent = parent

def solve(matrix_og, start):
    width = len(matrix_og[0])
    height = len(matrix_og)
    matrix = copy.deepcopy(matrix_og)
    maze_queue = deque([start])
    while(len(maze_queue)!=0):
        
        cur_val = maze_queue.popleft()
        x = cur_val.x
        y = cur_val.y
        matrix[y][x] = 2
        if x == width-1 and y == height-1:
            return cur_val
        # down
        if y+1 >= 0 and y+1 < height and matrix[y+1][x]==0:
            pos_down = pos(x,y+1,cur_val)
            maze_queue.append(pos_down)
            matrix[y+1][x] = 2
        # right
        if x+1 >= 0 and x+1 < width and matrix[y][x+1]==0:
            pos_right = pos(x+1,y,cur_val)
            maze_queue.append(pos_right)
            matrix[y][x+1] = 2
        # up
        if y-1 >= 0 and y-1 < height and matrix[y-1][x]==0:
            pos_up = pos(x,y-1,cur_val)
            maze_queue.append(pos_up)
            matrix[y-1][x] = 2
        # left
        if x-1 >= 0 and x-1 < width and matrix[y][x-1]==0:
            pos_left = pos(x-1,y,cur_val)
            maze_queue.append(pos_left)
            matrix[y][x-1] = 2
    print("i'mfucked")
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

start = pos(0,0,None)
solution = solve(matrix, start)
width = len(matrix[0])
height = len(matrix)
coords = []

while(solution.parent!=None):
    coords.append([solution.x, solution.y])
    solution = solution.parent
coords.append([solution.x, solution.y])
# print(coords)

for row in range(0,height):
    for col in range(0, width):
        if coords.count([col, row])!=0:
            matrix[row][col] = 3

for row in matrix:
    print(row)
