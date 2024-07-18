import java.util.*;
public class LinearSearch{
    public static int LS(int n[],int k){
        for(int i = 0;i<n.length;i++){
            if(n[i]==k){
                return i;
            }
            
        } return -1;
    }
    public static void GetLargest(int n[]){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for(int i =0;i<n.length;i++){
            if(Largest<n[i]){
                Largest = n[i];
            } 
            if(Smallest>n[i]){
                Smallest = n[i];
            }
        }
        System.out.println("smallest number in array is "+Smallest);
        System.out.println("Largest number in array is "+Largest);
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10,12,14};
        //int key = 11;
        //int check = LS(num,key);
        //if(check==-1){
          //  System.out.println("number is not found");
       // } else{
         //   System.out.println("Number is found");
       // }
       GetLargest(num);
    }
}