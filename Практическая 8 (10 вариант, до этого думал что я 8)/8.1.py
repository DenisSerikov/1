def F():
    k=[a,b,c]
    d=0
    for i in k:
        for v in k:
            for l in k:
                x = i*100+v*10+l
                if 100 <= x <= N:
                    d = d + 1
    return d
a = int(input("a:"))
b = int(input("b:"))
c = int(input("c:"))
if a > 10 or b > 10 or c > 10:
    print("Ошибка")
N = int(input("n:"))
if 210 < N < 231:
    d = F()
else:
    print("не входит в промежуток")
print(d)
