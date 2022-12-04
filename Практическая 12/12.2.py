x = []
def F():
    i = (int(input("Введите число: ")))
    x.append(i)
    if i != 0:
        return F()
    if i == 0:
        return max(x)
print("max: ", F())