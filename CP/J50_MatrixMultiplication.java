// Given two matrices, the task is to multiply them. Matrices can either be square or rectangular:

// Examples: 

// (Square Matrix Multiplication)

// Input: mat1[m][n] = { {1, 1}, {2, 2} }
// mat2[n][p] = { {1, 1}, {2, 2} }
// Output: result[m][p] = { {3, 3}, {6, 6} }


// Time Complexity - O(n^3)

import java.util.*;
public class J50_MatrixMultiplication {
    public static void main(String[]  arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();

        int a[][] =  new int[n][n];
        System.out.println("Enter elements in first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                a[i][j] = sc.nextInt();
        }

        int b[][] =  new int[n][n];
        System.out.println("Enter elements in second matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                b[i][j] = sc.nextInt();
        }

        //third matrix for storing result after matrix multiplication
        int[][]  c = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j] = 0;
                for(int k=0;k<n;k++)
                    c[i][j] += a[i][k]*b[k][j];
            }
        }

        //printing resultant array
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(c[i][j]+" ");
            System.out.println();
        }

        sc.close();
    }
    
}
