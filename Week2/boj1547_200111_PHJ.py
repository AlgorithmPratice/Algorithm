import sys

M = int(sys.stdin.readline().rstrip())
arrayX = []
arrayY = []

for i in range(0, M):
    XnY = sys.stdin.readline().rstrip().rsplit()
    arrayX.append(int(XnY[0]))
    arrayY.append(int(XnY[1])) 

balls = [True,True,False,False]

for i in range(0, M):
    X = arrayX[i]
    Y = arrayY[i]
    
    tmp = balls[X]
    balls[X] = balls[Y]
    balls[Y] = tmp

for i in range(1, 4):
    if balls[i]:
        print(i)
