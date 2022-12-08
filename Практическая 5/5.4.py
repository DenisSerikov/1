def fun():
    x = int(input())
    y = int(input())
    d=1
    while x<y:
        x = x*1.1
        d = d+1
    print(round(x))
fun()
