f=open('C:/Users/St.Oskol/Desktop/Сериков Денис Ромнович_У-223_vvod.txt','r')
l=open('C:/Users/St.Oskol/Desktop/Сериков Денис Ромнович_У-223_vivod.txt','w')
k=2
A=[]
C=[]
P=[]
for line in f:
    a=list(map(int, line.split()))
    A.append(a)
l.write('№9.1\n')
for i in range(3):
    P = sorted(A[i])
    if A[i] == P or A[i] == P[::-1]:
        l.write('max:\n')
        l.write((str(max(A[i]))))
l.write('\n\n')
l.write('№9.2\n')
l.write("Преобразованная матрица")
l.write('\n')
for i in range(3):
    D=[]
    for j in range(3):
        D.append(A[i][j])
    C.append(D)
A.clear()
C.sort(key=lambda x:x[k-1])
for i in range(3):
    B=[]
    for j in range(3):
        B.append(C[j][i])
    A.append(B)
for i in range (3):
    for j in range(3):
        l.write(str(A[i][j]))
        l.write(' ')
    l.write('\n')
f.close()
l.close()
