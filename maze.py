import time
import string

def solve(matrix):

    width = len(matrix[0])
    height = len(matrix)
    
    solution = []
    maze_stack = [ [0,0] ]
    
    while len(maze_stack)!=0:    
        
        print(maze_stack)
        cur_val = maze_stack.pop()
        solution.append(cur_val)
        
        y = cur_val[0]
        x = cur_val[1]
        
        # mark as visited
        matrix[y][x] = 3
        
        for row in matrix:
            print(row)
        print
        
        if(y==height-1 and x==width-1):
            print('solution found')
            print(solution)
            # for i in range(0,len(matrix[0])):
            #     for j in range(0,len(matrix)):
            #         
            return maze_stack
        
        dead_end = 1
        
        # up
        if y-1 >= 0 and y-1 < height:
            if matrix[y-1][x] == 0:
                maze_stack.append( [y-1,x] )
                # going to visit
                matrix[y-1][x] = 2
                dead_end = 0
        # down
        if y+1 >= 0 and y+1 < height:
            if matrix[y+1][x] == 0:
                maze_stack.append( [y+1,x] )
                matrix[y+1][x] = 2
                dead_end = 0
        # left
        if x-1 >= 0 and x-1 < width:
            if matrix[y][x-1] == 0:
                maze_stack.append( [y,x-1] )
                matrix[y][x-1] = 2
                dead_end = 0
        # right
        if x+1 >= 0 and x+1 < width:
            if matrix[y][x+1] == 0:
                maze_stack.append( [y,x+1] )
                matrix[y][x+1] = 2
                dead_end = 0
        if dead_end is 1:
            print("i'm gay")
            matrix[y][x] = 4
            solution.pop()
        time.sleep(1)

file1 = open('./maze.txt', 'r')
matrix = []
for line in file1:
    stringline = string.rstrip(line)
    strnums = stringline.split(' ')
    templist = []
    for strnum in strnums:
        templist.append(int(strnum))
    matrix.append(templist)

solve(matrix)

