M=int(input("кол-во сторок:"))
N=int(input("кол-во столбцов:"))
A=[]
P=[]
for i in range(M):
    B=[]
    for j in range(N):
        B.append(int(input()))
    A.append(B)
for i in range(M):
    for j in range(N):
        print(A[i][j], end='')
    print()

for i in range(M):
    P = sorted(A[i])
    if A[i]==P or A[i]==P[::-1]:
        print(max(A[i]))