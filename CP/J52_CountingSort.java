// Counting Sort Algorithm: Overview, Time Complexity & More
// Lesson 29 of 68By Simplilearn

// Last updated on Feb 17, 202318543
// Everything You Need to Know About the Counting Sort Algorithm
// PreviousNext
// Table of Contents
// What Is a Counting Sort Algorithm?Working on Counting Sort AlgorithmPseudo Code and Algorithm of Counting Sort AlgorithmThe Complexity of the Counting Sort AlgorithmComparison With Other Sorting AlgorithmsView More
// Harold Seward discovered Counting Sort in 1954. Counting sort is a linear sorting algorithm with asymptotic complexity O(n+k). The Counting Sort method is a fast and reliable sorting algorithm. Counting sort, unlike bubble and merge sort, is not a comparison-based algorithm. It avoids comparisons and takes advantage of the array's O(1) time insertions and deletions. 

// The Counting Sort algorithm sorts keys that are small integers and fall inside a particular range. It works by calculating the number of elements with each unique key value. After that, it performs specific mathematical calculations to sort each key value.

// What Is a Counting Sort Algorithm?
// Counting sort is an integer sorting algorithm used in computer science to collect objects according to keys that are small positive integers.
// It works by determining the positions of each key value in the output sequence by counting the number of objects with distinct key values and applying prefix sum to those counts.
// Because its running duration is proportional to the number of items and the difference between the maximum and minimum key values, it is only suited for direct usage when the number of items is not much more than the variation in keys.
// It's frequently used as a subroutine in radix sort, a more efficient sorting method for larger keys.

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
