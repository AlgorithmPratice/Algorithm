import sys

one = [True, False, True, False, True, False, True, False]
two = [False, True, False, True, False, True, False, True]

sumr = 0
for i in range(1, 9):
    S = list(sys.stdin.readline().rstrip())
    Target = None
    if i % 2 != 0:
        Target = one
    else:
        Target = two

    for j in range(0, 8):
        if Target[j] and S[j] == 'F':
            sumr += 1
print(sumr)
