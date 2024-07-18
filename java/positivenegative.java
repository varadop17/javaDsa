import java.util.*;
java class postivenegative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int sumeven=0;
        int sumodd=0;
        do{
            System.out.println("enter the number :");
            number = sc.nextInt();
            if(number%2==0){
                sumeven += number;
            } else{
                sumodd += number;
            }
            System.out.println("do you want to continue ? enter 1 for yes or 0 for no");
            choice = sc.nextInt();
             } while (choice == 1);
             System.out.println("sum of even number : "+sumeven);
             System.out.println("sum of odd number : "+sumodd);

        

    
}
}