import java.util.*;
public class J34_JaggedArray {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double a[][] = new double[N][];

        int x;
        for(int i=0;i<N;i++){
            x = sc.nextInt();
            a[i] = new double[x];
            for(int j=0;j<x;j++)
                a[i][j] = sc.nextDouble();
        }

        // System.out.println();
        // for(int i=0;i<N;i++){
        //     for(int j=0;j<a[i].length;j++)
        //         System.out.print(a[i][j]+" ");
        //     System.out.println();
        // }

        int subject = sc.nextInt();
        subject-=1;
        double sum = 0;
        for(int i=0;i<a[subject].length;i++)
            sum += a[subject][i];

        System.out.println("Average in Subject-"+(subject+1)+" is "+sum/a[subject].length);
        sc.close();
    }
}
