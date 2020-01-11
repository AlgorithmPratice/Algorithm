import sys

X = int(sys.stdin.readline().rstrip())
cnt = 0
A = 64

while True:
    if X >= A:
        X -= A
        cnt += 1
    else: 
        A /= 2
    
    if X == 0:
        break

print(cnt)
