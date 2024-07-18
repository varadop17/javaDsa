public class PairsinArray{
    public static void PrintPairs(int arr[]){
        int n = arr.length;
        int tp = 0;
        for(int i = 0;i<n;i++){
            for(int j =i+1 ;j<n;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }System.out.println();
        } System.out.println("Total numbers of pair are "+tp);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        PrintPairs(numbers);
    }
}