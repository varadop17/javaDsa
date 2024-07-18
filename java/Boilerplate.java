import java.util.*;
public class Boilerplate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int count = 1;
        int sum = 0;
        while(count<=n){
         sum = sum + count;
         count++;

        }
        System.out.print(sum);
    }  
}