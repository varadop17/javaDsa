import java.util.*;
public class kadanes{
    public static void kd(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.print(ms);
    }
 public static void main(String args[]){
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    kd(arr);
 }   
}

