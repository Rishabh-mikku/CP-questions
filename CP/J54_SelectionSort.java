public class J54_SelectionSort{

    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        int min, temp;
        for(int i=0;i<n;i++){
            min = i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min = j;
            }

            if(i != min){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;
    }
    public static void main(String[] arg){
        int[] arr = {7, 4, 10, 8, 3, 1};
        int[] sorted_array = selectionSort(arr);
        
        //printing sorted_array
        for(int i=0;i<arr.length;i++)
            System.out.print(sorted_array[i]+" ");
            
    }
}