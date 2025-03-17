total = 0
for i in range(0, 19, 2):
    if total % 2 == 0:
        total = i + total
        if i % 3 == 0:
            total = total - i
        else:
            total = total + 1
    else:
        print(total + i)
print(total)


