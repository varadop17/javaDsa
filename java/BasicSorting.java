public class BasicSorting{
    public static void BubbleSort(int arr[]){
        for(int turn = 0;turn<arr.length-1;turn++){
            for(int j = 0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void SelectionSort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int minpos = i;
            for(int j = i+1;j<arr.length;j++){ 
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void InsertionSort(int arr[]){
        for(int i =1;i<arr.length;i++){
            int curr = i;
            int prev = i-1;
            //finding out correct position to insert
            while(prev>=0 && arr[prev]>arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int [largest+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for(int i =0;i<arr.length;i++){
            while(count[i]>0){
               arr[j] = i;
               j++;
               count[i]--;
            }
        }
    }
    public static void PrintArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int numbers[] = {5,4,1,3,2};
        CountingSort(numbers);
        PrintArray(numbers);


    }
}