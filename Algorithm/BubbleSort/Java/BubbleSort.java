package Algorithm.BubbleSort.Java;

import java.util.Random;

public class BubbleSort{

    public static void main(String args[]) {
        Random rand = new Random();
        int[] arr= new int[10];
        System.out.println("Input Array");
       for(int i=0;i<10;i++){
        arr[i]= rand.nextInt(1000);
        System.out.print(arr[i]+",");
       }
       sort(arr);
       System.out.println("Sorted Array");
       for(int i=0;i<10;i++){
        System.out.print(arr[i]+",");
       }
       

    }

    private static void sort(int arr[]){
        for(int i=(arr.length -1);i>=0;i--){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
}
