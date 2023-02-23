// Given an array (or string), the task is to reverse the array/string.
// Examples : 
 

// Input  : arr[] = {1, 2, 3}
// Output : arr[] = {3, 2, 1}

// Input :  arr[] = {4, 5, 1, 2}
// Output : arr[] = {2, 1, 5, 4}

import java.util.*;
public class J45_ReversetheArray {

    int[] Reverse_Array(int[] arr){
        // int temp;
        int size = arr.length;
        for(int i=0;i<arr.length/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }

        return arr;
    }
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        J45_ReversetheArray obj = new J45_ReversetheArray();
        int rev_arr[] = obj.Reverse_Array(arr);
        for(int i=0;i<rev_arr.length;i++)
            System.out.print(rev_arr[i]+" ");
        System.out.println();

        sc.close();
    }
}
