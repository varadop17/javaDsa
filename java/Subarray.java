import java.util.*;
public class Subarray{
    public static void printSubarray(int arr[ ]){
        for (int i = 0;i<arr.length;i++){
              int start = i;
            for (int j = i;j<arr.length;j++){
              int end = j; 
               for(int k = start;k<=end;k++){
                System.out.print(arr[k]+" ");
               } 
               System.out.println();
            } 
            System.out.println(); 
        }
    }
    public static void MaxSubarraySum(int arr[]){
        int sum =  0;
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
              int start = i;
            for (int j = i;j<arr.length;j++){
              int end = j; 
              sum = 0;
               for(int k = start;k<=end;k++){
                sum += arr[k];
               } 
               System.out.println(sum);
               if(MaxSum<sum){
                  MaxSum = sum;
               }
            } 
        }
          System.out.println("max sum ="+MaxSum);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        //printSubarray(numbers);
        MaxSubarraySum(numbers);  
    }
}