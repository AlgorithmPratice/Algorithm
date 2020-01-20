import sys

A, B, C = map(int, sys.stdin.readline().rstrip().split())

park_A, start_A = map(int, sys.stdin.readline().rstrip().split())
park_B, start_B = map(int, sys.stdin.readline().rstrip().split())
park_C, start_C = map(int, sys.stdin.readline().rstrip().split())
park = [park_A + 1, park_B + 1, park_C + 1]
start = [start_A, start_B, start_C]

min = min(park_A, park_B, park_C)
max = max(start_A, start_B, start_C)

arr = [0 for _ in range(0, max)]

for idx in range(0, 3):
    for i in range(park[idx], start[idx] + 1):
        arr[i - 1] += 1
sumr = 0
for item in arr:
    if item == 1:
        sumr += A
    elif item == 2:
        sumr += B * 2
    elif item == 3:
        sumr += C * 3

print(sumr)
