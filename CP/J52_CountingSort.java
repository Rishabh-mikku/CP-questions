public class J52_CountingSort{

    public static int[] CountSort(int[] arr, int n){

        //finding maximum element in an original array
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > max)
                max = arr[i];
        }
        int k = max;

        //declaring count array with size k+1
        int[] count = new int[k+1];

        //initializing every position of count array with 0 at beginning
        for(int i=0;i<k+1;i++)
            count[i] = 0;

        //calculating frequency of each element of original array arr and storing it frequency in their index value or at key's index
        for(int i=0;i<n;i++)
            count[arr[i]]++;

        //calculating cumulative sum of frequency and storing it in same count array
        int cumulative_sum = 0;
        for(int i=0;i<k+1;i++){
            cumulative_sum += count[i];
            count[i] = cumulative_sum;
        }

        //declaring a sorted_array to store the elements in sorted order in this array of size n equal to size of original array arr
        int[] sorted_array = new int[n];
        for(int i=n-1;i>=0;i--){
            count[arr[i]]--;
            sorted_array[count[arr[i]]] = arr[i];
        }

        return sorted_array;
    }
    public static void main(String[] arg){
        int[] arr = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9};
        int n = arr.length;
        int sort_array[] = CountSort(arr, n);
        for(int i=0;i<sort_array.length;i++)
            System.out.print(sort_array[i]+" ");
    }
}
