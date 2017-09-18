import time
import copy
from collections import deque

def solve(matrix):
    counter = 0
    width = len(matrix[0])
    height = len(matrix)
    solution = deque([])
    queue = deque( [[0,0]] )
    copy_matrix = copy.deepcopy(matrix)
    
    while len(queue)!=0:
        
        new_val = queue.popleft()
        solution.append(new_val)
        print(solution)
        y = new_val[0]
        x = new_val[1]
        
        """
        3 3
        3 0
        queue
        [[0,0]]
        [[0,1],[1,0]]
        sol
        [[0,0]]
        [[0,0],[0,1]]
        """
        
        copy_matrix[y][x] = 3
        # mark as visited
        # matrix[y][x] = 8
        for row in copy_matrix:
            print(row)
        print
        
        
        if(y==height-1 and x==width-1):
            print('solution found')
            return solution
        
        dead_end = 1
        
        # up
        if y-1 >= 0 and y-1 < height:
            if copy_matrix[y-1][x] == 0:
                queue.append( [y-1,x] )
                copy_matrix[y-1][x] = 3
                dead_end = 0
        # down
        if y+1 >= 0 and y+1 < height:
            if copy_matrix[y+1][x] == 0:
                queue.append( [y+1,x] )
                copy_matrix[y+1][x] = 3
                dead_end = 0
        # left
        if x-1 >= 0 and x-1 < width:
            if copy_matrix[y][x-1] == 0:
                queue.append( [y,x-1] )
                copy_matrix[y][x-1] = 3
                dead_end = 0
        # right
        if x+1 >= 0 and x+1 < width:
            if copy_matrix[y][x+1] == 0:
                queue.append( [y,x+1] )
                copy_matrix[y][x+1] = 3
                dead_end = 0
        if dead_end == 1:
            solution.remove([y, x])
        time.sleep(1)
        counter+=1
    
    
    
"""
0 0 0 0 
0 1 1 1
0 0 0 0

"""
matrix = [[0,0,0,0], [0,1,1,1], [0,0,0,0]]

print(solve(matrix))