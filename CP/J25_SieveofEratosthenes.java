// Sieve Of Eratosthenes Algorithm to display all prime numbers upto a given number
// Time Complexity = O(n log log n)

import java.util.*;
public class J25_SieveofEratosthenes {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        // a[0] = 0;
        // a[1] = 0;
        for(int i = 2;i <= n;i++)
        a[i] = i;

        for(int i = 2;i <= n;i++){
            if(a[i] != 0){
                int j = i*i;
                while(j <= n){
                    a[j] = 0;
                    j += i;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(a[i]!=0)
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
