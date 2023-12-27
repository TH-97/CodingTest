import java.io.*;
import java.util.*;

class Test {
    int size = 0;
    int[] arr;
    public Test(int len) {
        arr = new int[len];
    }
    public void push(int i){
        arr[size] = i;
        size++;
    }
   public void pop(){
        int result = arr[arr.length-1];
        int[] arr2 = new int[arr.length-1];
        for(int i = 0 ; i < arr.length-1;i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
        System.out.println("마지막 값: " +result);
   }
   public void display(){
       for(int i : arr){
           System.out.print(i + " ");
       }
   }

    public static void main(String[] args) {
        Test t = new Test(3);
        t.push(1);
        t.push(2);
        t.push(3);
        t.pop();
        t.display();

    }
}
