import sys

y_axis, x_axis = map(int, sys.stdin.readline().split())

board = []
for _ in range(y_axis):
    board.append(list(map(str, list(sys.stdin.readline()))))

num_replaced_by_line_BW = [[0 for _ in range(x_axis)] for _ in range(y_axis)]
num_replaced_by_line_WB = [[0 for _ in range(x_axis)] for _ in range(y_axis)]

for i in range(x_axis):
    for j in range(y_axis):
        if (i + j) % 2 == 0:
            if board[j][i] == 'B':
                pass
            else:
                num_replaced_by_line_BW[j][i] += 1
        else:
            if board[j][i] == 'W':
                pass
            else:
                num_replaced_by_line_BW[j][i] += 1

for i in range(x_axis):
    for j in range(y_axis):
        if (i + j) % 2 == 0:
            if board[j][i] == 'W':
                pass
            else:
                num_replaced_by_line_WB[j][i] += 1
        else:
            if board[j][i] == 'B':
                pass
            else:
                num_replaced_by_line_WB[j][i] += 1

min_num = 64

for i in range(7, x_axis):
    for j in range(7, y_axis):
        sum_num = 0
        for p in range(8):
            for q in range(8):
                if num_replaced_by_line_BW[j-q][i-p]:
                    sum_num += 1
        if sum_num <= min_num:
            min_num = sum_num

for i in range(7, x_axis):
    for j in range(7, y_axis):
        sum_num = 0
        for p in range(8):
            for q in range(8):
                if num_replaced_by_line_WB[j-q][i-p]:
                    sum_num += 1
        if sum_num <= min_num:
            min_num = sum_num

print(int(min_num))
