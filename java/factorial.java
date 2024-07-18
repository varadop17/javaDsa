import java.util.*;
public class factorial{
    public static boolean fact(int n){
        boolean flag = true;
        for(int i = 2 ;i<=n/2;i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }    
            return flag;
            
      
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=100;i++){
        if((fact(i)==true)&&(i!=1) ){
            System.out.println(i);
        }
    }
}    
}