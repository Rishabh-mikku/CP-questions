import java.util.*;
class J24_pattern{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++)
            System.out.print(" ");

            for(int j=1;j<=i;j++){
                if(j==i)
                System.out.print(i);
                else
                System.out.print(i+" ");

            }
            
            if(i!=n)
            System.out.print("</br>");
            System.out.println();
        }
        sc.close();
    }
}