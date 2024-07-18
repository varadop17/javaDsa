public class RecursionBasic{
    public static int firstOccurence(int arr[],int key,int i){
         if(i==arr.length-1){
          return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendsPairing(n-1);
        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = fnm1 * fnm2;
        int totWays = fnm1 + pairWays;
        return totWays;
    }
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.print(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            removeDuplicates(str,idx+1,newStr,map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }
    
    public static int tilingProblem(int n){
        //base Condition
        if(n == 0 || n == 1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);
        //horizontal choice
        int fnm2 = tilingProblem(n-2);
        
        int totWays = fnm1 + fnm2 ;
        return totWays;
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
          return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int s = n + sum(n-1);
        return s;
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);    

        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void printDec(int n){
        if(n==1){
           System.out.print(n);
           return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args){
        int n = 5;
        int arr[] = {8,3,6,10,5,2,5,3};
        String str = "appnnacollege";
       System.out.print(friendsPairing(5));
    }
}