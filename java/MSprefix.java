import java.util.*;
public class MSprefix{
    public static void MaxSubarraySum(int arr[]){
        int sum =  0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[]= new int [arr.length];
        prefix[0]=arr[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0;i<arr.length;i++){
              int start = i;
            for (int j = i;j<arr.length;j++){
              int end = j; 
              sum = start==0? prefix[end]:prefix[end]-prefix[start-1];
               
               if(MaxSum<sum){
                  MaxSum = sum;
               }
            } 
        }
          System.out.println("max sum ="+MaxSum);
    
    }
 public static void main(String args[]){
    int numbers[] ={1,-2,6,-1,3};
    MaxSubarraySum(numbers);
 }
}