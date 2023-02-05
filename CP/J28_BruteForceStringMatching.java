import java.util.*;
public class J28_BruteForceStringMatching{

    int BruteForceStringMatching(String T, String P){

        int j;
        int pattern_length = P.length();
        for(int i=0;i<T.length()-P.length();i++){
            j=0;

            while(j<P.length() && P.charAt(j)==T.charAt(i+j))
                j++;
            // System.out.println(j);
            if(j == pattern_length)
                return i;
        }
        return -1;
    }
    public static void main(String[] arg){
        J28_BruteForceStringMatching obj = new J28_BruteForceStringMatching();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String T = sc.next();
        System.out.println("Enter a Pattern to search");
        String P = sc.next();
        int result = obj.BruteForceStringMatching(T,P);
        System.out.println(result);

        sc.close();
    }
}