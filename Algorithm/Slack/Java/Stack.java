package Algorithm.Slack.Java;

import java.util.Random;
class Stack{

    
    int size=0;
    int max;
    int[] arr;
    public Stack(int max){
        this.max= max;
        this.arr= new int[max];
    }

    public void pop(){
        if(size == 0){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Last element is"+ arr[size-1]);
            size--;
        }
    }

    public void sizeOfStack(){
        if(size == 0){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Size of Stack is"+ (size));
        }
    }

    public void push(int item){
        if(size>=max){
            System.out.println("Stack is full");
        }else{
            arr[size++]=item;
        }
    }
}

class Main{
    public static void main(String args[]){
        Stack stack = new Stack(10);
        Random rand = new Random();
        //When stack is empty
        stack.sizeOfStack();
        //insert element in stack
        stack.push(100);
        stack.sizeOfStack();

        //Full the stak and then pop
       for(int i=0;i<9;i++){
           stack.push(rand.nextInt(1000));
       }
       stack.sizeOfStack();

       //here it should fail as tack os full
       stack.push(rand.nextInt(1000));

       //pop element
       stack.pop();
    }
}