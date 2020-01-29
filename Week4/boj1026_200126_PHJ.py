import sys

N = int(sys.stdin.readline().rstrip())
A = list(map(int, sys.stdin.readline().rstrip().split()))
B = list(map(int, sys.stdin.readline().rstrip().split()))


def merge_sort(arr, desc):
    if len(arr) <= 1:
        return arr
    half = len(arr) // 2
    L = merge_sort(arr[:half], desc)
    R = merge_sort(arr[half:], desc)
    mer = []

    while len(L) > 0 and len(R) > 0:
        if (L[0] > R[0] and not desc) or (L[0] < R[0] and desc):
            mer.append(R[0])
            R.pop(0)
        else:
            mer.append(L[0])
            L.pop(0)
    if len(L) > 0:
        mer += L
    if len(R) > 0:
        mer += R
    return mer


sumr = 0
one = merge_sort(A, False)
two = merge_sort(B, True)
for i in range(0, len(one)):
    sumr += (one[i] * two[i])

print(sumr)
