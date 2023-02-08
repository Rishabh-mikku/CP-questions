import java.util.*;
public class J29_COOK14_NETFLIX {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int x=sc.nextInt();

            if(a+b>=x || b+c>=x || c+a>=x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
