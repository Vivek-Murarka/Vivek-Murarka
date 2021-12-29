package Algorithm.Queues.Java;

import java.util.Random;

public class Queues {
    int item;
    int head;
    int tail;
    int[] arr;
    int size;

    public Queues(int size){
        this.head=0;
        this.tail=0;
        this.size= size;
        this.arr= new int[size];
    }

    public void insert(int item){
        if(tail == size){
            System.out.println("Queue is full");
        }else{
            arr[tail++]=item;
        }
    }

    public void remove(){
        if(head == tail){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Item removed: "+arr[head++]);
        }
    }

    public void peek(){
        if(head == tail){
            System.out.println("Queue is empty");
        }else{
            for(int i= head;i<tail;i++)
            System.out.println("Item at: "+i+"is: "+arr[i]);
        }
    }
}

class Main{

    public static void main(String args[]) {

        Queues queue= new Queues(10);
        Random rand = new Random();
        //When queue is empty
        queue.peek();


        //Full the queue and then remove
        for(int i=0;i<9;i++){
            queue.insert(rand.nextInt(1000));
        }
        queue.peek();

        //here it should fail as tack os full
        queue.insert(rand.nextInt(1000));

        //pop element
        queue.remove();

        queue.peek();

        //pop element
        queue.remove();

        queue.peek();


        
    }
}