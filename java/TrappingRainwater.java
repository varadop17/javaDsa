import java.util.*;
public class TrappingRainwater{
    public static int TrapWater(int height[]){
        int n = height.length;
        //calculate leftmax boundary - Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //calculate rightmax boundary - array
        int rightMax[]= new int [n];
        rightMax[n-1]=height[n-1];
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        //loop  
        int trapedWater= 0;
        for(int i = 0;i<n;i++){
            //Waterlevel = min(leftmax,rightmax)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trappedwater = trapedwater + waterlevel - height
            trapedWater = trapedWater + waterLevel-height[i];
        }    
        return trapedWater;
    
    } 
    public static void main(String args[]){
       int height[] = {4,2,0,6,3,2,5}; 
       System.out.println(TrapWater(height));
    }
} 