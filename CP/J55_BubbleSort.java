public class J55_BubbleSort {

    public static int[]  BubbleSort(int[] arr){
        int n = arr.length;
        int temp;

        for(int i=0;i<n-1;i++){
            
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] arg){
        int[] arr = {7, 4, 10, 8, 3, 1};
        int[] sorted_array = BubbleSort(arr);

        //print sorted array
        for(int i=0;i<sorted_array.length;i++)
            System.out.print(sorted_array[i]+" ");
            
    }
    
}
