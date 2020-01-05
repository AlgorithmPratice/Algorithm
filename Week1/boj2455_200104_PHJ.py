import sys

sub_max = 0
memory = 0
for i in range(0,4):
    N = sys.stdin.readline().rstrip().split()
    sub_out = int(N[0])
    sub_in = int(N[1])
    
    memory -= sub_out
    memory += sub_in
    
    if memory > sub_max:
        sub_max = memory

print(sub_max)
