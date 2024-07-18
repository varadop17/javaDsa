import java.util.*;
public class Table{
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        int num = 4; 
        char letter ='A';
        
        for (int line = 1; line <= num; line++){
            for(int star = 1; star <= line; star++){
                System.out.print(letter);
                letter++;
                
            }
            System.out.println();
        }
        
        

    }
}