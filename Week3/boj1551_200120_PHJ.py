import sys

N, K = map(int, sys.stdin.readline().rstrip().split())
A = list(map(int, sys.stdin.readline().rstrip().split(',')))
result = []

# 첫 회
for i in range(1, N):
    result.append(A[i] - A[i-1])

for j in range(1, K):
    result2 = []
    for i in range(1, len(result)):
        result2.append(result[i] - result[i-1])
    result = result2
String = ""
if K == 0:
    for item in A:
        String += str(item)
        String += ','
else:
    for item in result:
        String += str(item)
        String += ','
print(String[0:-1])
