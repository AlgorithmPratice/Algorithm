import sys

a, b = map(str, sys.stdin.readline().rstrip().split())

idx = len(b) - len(a) + 1

Min = 50
for i in range(idx):
    diff = 0
    for j in range(len(a)):
        if a[j] != b[i+j]:
            diff += 1

    if diff < Min:
        Min = diff

print(Min)
