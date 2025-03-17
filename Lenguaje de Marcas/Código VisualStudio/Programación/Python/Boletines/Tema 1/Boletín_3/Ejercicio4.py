total = 3
for i in range(0, 19, 2):
    if total % 2 == 0:
        total = i+ total
    elif i % 3 == 0:
        total = 4
    else:
        total = total+ 1
print(total)
