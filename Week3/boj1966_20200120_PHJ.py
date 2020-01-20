import sys

T = int(sys.stdin.readline().rstrip())

for i in range(0,T):
    N, M = map(int,sys.stdin.readline().rstrip().split())
    arr = list(map(int,sys.stdin.readline().rstrip().split()))
    prior_number = []
    
    for j in arr:
        prior_number.append(j) 
    
    result = [0 for _ in range(N)]
    queue = [k for k in range(N)]
    sequence = 1
    while queue:
        if arr[queue[0]] == max(prior_number):
            prior_number.remove(max(prior_number))
            result[queue.pop(0)] = sequence
            sequence += 1
        else:
            queue.append(queue.pop(0))
    print(result[M])
