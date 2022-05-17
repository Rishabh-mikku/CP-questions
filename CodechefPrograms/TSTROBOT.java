import java.util.*;

class TSTROBOT {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            int N, X;
            String S;
            while (T-- > 0) {
                N = sc.nextInt();
                X = sc.nextInt();
                S = sc.next();
                HashSet<Integer> set = new HashSet<>();
                set.add(X);
                for (int i = 0; i < N; i++) {
                    if (S.charAt(i) == 'R')
                        set.add(++X);
                    else
                        set.add(--X);
                }
                System.out.println(set.size());
            }
        } catch (Exception e) {
            return;
        }
    }
}