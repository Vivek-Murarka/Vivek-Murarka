class Stack:
    #constructor for initialization
    def __init__(self):
        self.items = []
    def isEmpty(self):
        return self.items == []
    def push(self, item):
        self.items.append(item)
    def pop(self):
        return self.items.pop()
    def peek(self):
        return self.items[len(self.items)-1]
    def size(self):
        return len(self.items)

stack=Stack()
stack.size()
stack.push('Red')
stack.push('Green')
stack.push('Yellow')
stack.push('Orange')
print(stack.size())
stack.pop()
print(stack.size())