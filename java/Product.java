import java.util.*;
public class Product {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number;
    int fact=1;
    System.out.println("enter the number :");
    number = sc.nextInt();
    for(int i=1;i<=number;i++){
        fact = fact * i;
    }
    System.out.println("factorial of given number is "+fact);
    }
}
    
    



