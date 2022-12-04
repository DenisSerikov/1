def F(n, r=0):
    if not n:
        return r
    r += n % 10
    n //= 10
    return F(n, r)
print(F(int(input())))