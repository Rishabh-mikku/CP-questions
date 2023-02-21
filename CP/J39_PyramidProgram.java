import java.util.*;
public class J39_PyramidProgram{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //for printing left side spaces
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            //for printing star
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
            }
        sc.close();
    }
}