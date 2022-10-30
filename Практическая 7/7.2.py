m = list(map(float, input().split()))
mv = sum(m) / len(m)
for i in range(len(m)):
    if m[i] == 0:
        m[i] = mv
print(m[i], end=" ")