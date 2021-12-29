import random
list= []
for i in range(0,10):
    list.append(random.randint(0,22))

print(list)

def sort():
    lastElementIndex= len(list) -1
    for passNo in range(lastElementIndex,0,-1): #here range(__start: SupportsIndex, __stop: SupportsIndex, __step: SupportsIndex = ...)
        for idx in range(lastElementIndex): #here range(stopIndex)
            if list[idx] > list[idx+1]:
                list[idx], list[idx+1]= list[idx+1], list[idx]

sort()
print(list)
