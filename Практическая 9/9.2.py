M=int(input("кол-во строк:"))
N=int(input("кол-во столбцов:"))
k=int(input("k:"))
A=[]
C=[]
for i in range(M):
    B=[]
    for j in range(N):
        B.append(int(input()))
    A.append(B)
print("Начальная матрица")
for i in range(M):
    for j in range(N):
        print(A[i][j], end=" ")
    print()
print("Преобразованная матрица")
for i in range(M):
    D=[]
    for j in range(N):
        D.append(A[i][j])
    C.append(D)
A.clear()
C.sort(key=lambda x:x[k-1])
for i in range(M):
    B=[]
    for j in range(N):
        B.append(C[j][i])
    A.append(B)
for i in range (M):
    for j in range(N):
        print(A[i][j], end=" ")
    print()