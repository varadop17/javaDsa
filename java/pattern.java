public class pattern{ 
    public static void hollow_rectangle(int NoofRows,int NoofCols){
        for(int i = 1;i<=NoofRows;i++){
            for(int j= 1;j<=NoofCols;j++){
            if(i ==1||i == NoofRows ||j == 1 ||j == NoofCols){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }System.out.print("\n");
        }
    }
    public static void inverted_pyramid(int n ){
        for ( int i =1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print("*");
            } System.out.println();
        }
    }
    public static void inverted_number_pyramid(int n){
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n-i+1;j++){
              System.out.print(j);
            } System.out.println();
        }
    }
    

    public static void main(String args[]){
       inverted_number_pyramid(4);

    }
}