x = input()                        
x_size = len(x)
origin = []
adap = []

for i in range(x_size):
    origin.append(x[i])

for j in range(x_size):
    adap.append(x[x_size-(j+1)])

print(origin)
print(adap)

if origin == adap :
    print(True)
else :
    print(False)
