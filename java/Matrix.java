import java.util.*;
public class Matrix{
public static void Search(int matrix[][],int key){
     int n = matrix.length;
    int m = matrix[0].length;
    for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            if(matrix[i][j]==key){
                System.out.print("Element found");
        
            } 
        }
    }
}
public static int DiagonalSum(int matrix[][]){
    int sum = 0;
    //Time complexity O(n^2)
   // for(int i = 0;i<matrix.length;i++){
    //    for(int j = 0;j<matrix[0].length;j++){
      //       if(i==j){
         //        sum += matrix[i][j];
       //      }
        //     if(i+j== matrix.length-1){
        //         sum += matrix[i][j];
        //     }
       //  }
    //  more optimised code
        for(int i = 0;i<matrix.length;i++){
            //primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if(i!=matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
            
            
        }
        return sum;
    }
    

public static void printSpiral(int matrix[][]){
    int startrow = 0;
    int startcol = 0;
    int endrow = matrix.length - 1;
    int endcol = matrix[0].length - 1;
    while(startrow <= endrow && startcol<=endcol){
        //top
        for(int j = startcol;j<=endcol;j++){
            System.out.print(matrix[startrow][j]+" ");
        }
        //right
        for(int i = startrow+1;i<=endrow;i++){
            System.out.print(matrix[i][endcol]+" ");
        }
        //bottom
        for ( int j = endcol -1;j>=startcol;j--){
            if(startrow==endrow){
                break;
            }
             System.out.print(matrix[endcol][j]+" ");
        }
        //left
        for(int i = endrow-1;i>=startrow+1;i--){
            if(startcol==endcol){
                break;
            }
             System.out.print(matrix[i][startcol]+" ");
        }
        startcol++;
        startrow++;
        endcol --;
        endrow --;
    }
}
public static void main(String args[]){
    int key = 3;
    //int matrix [][] = new int [3][3];
    //Scanner sc = new Scanner(System.in);
    //int n = matrix.length;
    //int m = matrix[0].length;
    //for(int i = 0;i<n;i++){
    //    for(int j = 0;j<m;j++){
      //      matrix[i][j]= sc.nextInt();
      //  }
    //}
    //for(int i =0;i<n;i++){
      //  for(int j = 0;j<m;j++){
      //      System.out.print(matrix[i][j]+" ");
        //}
       // System.out.println();
       int matrix [][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       System.out.println(DiagonalSum(matrix));
}
}

  

