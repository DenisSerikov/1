def fun():
    n= int(input())
    a=0
    while True:
        b=int(input())
        if b == 0:
            break
        if b > n:
            a = a+1
        n=b
    print(a)
fun()
