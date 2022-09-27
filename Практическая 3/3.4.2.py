a = int(input())
b = int(input())
l = int(input())
N = int(input())
def fun(a,b,l,N):   
    return (2*l + a + (2*b + 2*a)*(N-1))
print(fun(a,b,l,N))
