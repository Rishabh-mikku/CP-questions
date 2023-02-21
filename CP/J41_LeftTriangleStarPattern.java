/*     *
      **
     ***
    ****
   ***** 
 */

import java.util.*;
public class J41_LeftTriangleStarPattern {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            //for printing left side spaces
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            //for printing star pattern
            for(int j=0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
}
}
