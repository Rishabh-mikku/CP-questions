public class J49_QuickSort {

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;       //for swapping
        // int temp;

        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;  //pivot index
    }
    public static void QuickSort(int[] arr, int low, int high){
        if(low >= high)
            return;
        
        int pivot_index = partition(arr, low, high);
        QuickSort(arr, low, pivot_index-1);
        QuickSort(arr, pivot_index+1, high);
    }
    public static void main(String[] arg){
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        QuickSort(arr, 0, n-1);

        //print
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}