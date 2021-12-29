class Queue:
    def __init__(self) :
        self.head=0
        self.tail=0
        self.items= []

    def insert(self,item):
        self.items.insert(self.tail,item)
        self.tail+=1
    
    def remove(self):
        print("Head: ",self.head,"Tail:",self.tail)
        if(self.head == self.tail):
            print("Queue is empty")
        else:
            del self.items[0]
            self.head+=1
    
    def peek(self):
        for item in self.items:
            print(item)

    
#Test 
queue= Queue()

queue.insert('Red')
queue.insert('Green')
queue.insert('Yellow')

queue.peek()
print("Remove FIFO")
queue.remove()
queue.peek()

print("Re-insert")
queue.insert('Red')
queue.peek()

print("Remove FIFO")
queue.remove()
queue.peek()
