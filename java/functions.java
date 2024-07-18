import java.util.*;
public class functions {
    public static int fact(int n){
        int f = 1;
        for (int i = 1;i<= n;i++){
            f = f * i;
        }

        return f;


    }
    public static int bincoeff(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        int bc = fact_n / (fact_r*fact_nmr);
        return bc;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
       int  bc = bincoeff(n,r);

       System.out.println(bc);
    }
}