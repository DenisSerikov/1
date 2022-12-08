def fun():
    from random import *
    l = [randint(0,9)for i in range(10)]
    print(l)
    rep=[]
    for i in set(l):
        if l.count(i)>1:
            rep.append(i)
    if len(rep) == 0:
        print("значений нет")
    print(rep)
fun()
