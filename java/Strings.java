import java.util.*;
public class Strings{
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i = 0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;

    }
    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i =0;i<path.length();i++){
            char dir = path.charAt(i);
            
            if(dir=='S'){
                y--; //SOUTH
            }else if(dir=='N'){
                y++; //NORTH
            }else if(dir=='E'){
                x++; //EAST
            }else if(dir=='W'){
                x--; //WEST
            }
            
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
        }      
    public static String substring(String str ,int si,int ei){
        String sub = "";
        for(int i =si;i<ei;i++){
            sub += str.charAt(i);
        } 
        return sub;
    }      
    public static void main(String args[]){
       /* char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        String fullName = "Tony Stark";
        System.out.print(fullName.length());*/
       // String name = "AVarad";
       // System.out.print(isPalindrome(name));
       //String direction = ("WNEENESENNN");
       //System.out.print(getShortestPath(direction));
       String str = "HelloWorld";
       System.out.println(substring(str,0,5));
       String fruits[] = {"apple","mango","banana"};
       String largest = fruits[0];
       for(int i =1;i<fruits.length;i++){
        if(largest.compareTo(fruits[i])<0){
            largest = fruits[i];
        }

       }
     System.out.print(largest);
    }
}