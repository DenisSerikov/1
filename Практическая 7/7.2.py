import random
m1=[]
m2=[]
for i in range(15):
    m1.append(random.randint(0,30))
    m2.append(m1[i])
    if m1[i]<10:
        m2[i]=0
    if m1[i]>20:
        m2[i]=1
print("Начальный массив:\n",m1,"\nПреобразованный массив:\n",m2)