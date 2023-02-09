// Ramesh and Rahul are playing a game where Ramesh is creating 4*5 matrix in an unsorted integer. Rahul then sorts the 4*5 matrix across rows.

// Input Format

// 1 8 4 7 3
// 8 3 1 7 5
// 6 2 0 7 1
// 2 6 4 1 9

// Constraints

// The 2D array should have 4 rows and 5 columns
// Sort the array across row
// Output Format

// 1 3 4 7 8 1 3 5 7 8 0 1 2 6 7 1 2 4 6 9

// Sample Input 0

// 1 8 4 7 3 
// 8 3 1 7 5 
// 6 2 0 7 1 
// 2 6 4 1 9 
// Sample Output 0

// 1 3 4 7 8 
// 1 3 5 7 8 
// 0 1 2 6 7 
// 1 2 4 6 9 

import java.util.*;
public class J35_SortingtwodimensionalArray_Rowwise {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int ar[][] = new int[4][];             // Using concept of Jagged Array

        for(int i=0;i<4;i++){
            ar[i] = new int[5];
            for(int j=0;j<5;j++)
                ar[i][j] = sc.nextInt();
        }

        //Now sorting array using Arrays.sort() method present in util package
        
        for(int i=0;i<4;i++){
            Arrays.sort(ar[i]);
            System.out.println();
            for(int j=0;j<5;j++)
                System.out.print(ar[i][j]+" ");
        }
        sc.close();
    }
}
