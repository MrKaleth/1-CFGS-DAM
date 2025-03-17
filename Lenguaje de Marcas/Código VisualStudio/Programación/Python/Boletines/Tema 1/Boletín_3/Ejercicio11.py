producto = 1
for i in range(0, 20):
    if i % 2 != 0:
        print(i, "x", producto, "=", producto*i)
        producto = producto * i