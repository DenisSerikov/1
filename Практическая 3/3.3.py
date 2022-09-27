n = int(input())
h = 0
m = 0
if n<1440:
    if n>60:
        h = n//60
        m = n % 60
        print(h,':',m)
    else:
        print
