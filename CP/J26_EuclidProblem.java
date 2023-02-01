// Euclid Algorithm to find the GCD of two numbers
// Time Complexity - O(log min{num1,num2})
import java.util.*;
public class J26_EuclidProblem {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ot find their GCD");
        int m=sc.nextInt();
        int n=sc.nextInt();
        while(n!=0){
            int r = m % n;
            m = n;
            n = r;
        }
        System.out.println(m);
        sc.close();
    }
}
