// Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.

// Algorithm

// // Sort an arr[] of size n

// insertionSort(arr, n)

// Loop from i = 1 to n-1.

// ……a) Pick element arr[i] and insert it into sorted sequence arr[0…i-1]

// Time Complexities:
// Best Case Complexity: The insertion sort algorithm has a best-case time complexity of O(n) for the already sorted array because here, only the outer loop is running n times, and the inner loop is kept still.
// Average Case Complexity: The average-case time complexity for the insertion sort algorithm is O(n2), which is incurred when the existing elements are in jumbled order, i.e., neither in the ascending order nor in the descending order.
// Worst Case Complexity: The worst-case time complexity is also O(n2), which occurs when we sort the ascending order of an array into the descending order.
// In this algorithm, every individual element is compared with the rest of the elements, due to which n-1 comparisons are made for every nth element.
// The insertion sort algorithm is highly recommended, especially when a few elements are left for sorting or in case the array encompasses few elements.

// Space Complexity
// The insertion sort encompasses a space complexity of O(1) due to the usage of an extra variable key.

public class J51_InsertionSort {
    public static void InsertionSort(int[] arr, int n){
        int temp, j;

        for(int i=1;i<n;i++){
            temp = arr[i];
            j = i - 1;
            
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--; 
            }

            arr[j + 1] = temp;
        }

    }
    public static void main(String[] arg){
        int arr[] = {5, 4, 10, 1, 6, 2};
        int n = arr.length;
        InsertionSort(arr, n);

        //print
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    
}
