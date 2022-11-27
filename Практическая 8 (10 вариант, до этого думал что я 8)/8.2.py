def F():
    k = input("Слова:")
    return ' '.join(k.split(' ')[::-1])
l = F()
print(l)