import java.util.*;
public class J36_Frequencyusingarray {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();

        int freq[] = new int[123];
        for(int i=0;i<123;i++)
            freq[i] = 0;

        for(int i=0;i<length;i++){
            freq[(char)s.charAt(i)+1]++;
        }

        // Displaying frequency of each character

        // Using HashSet
        HashSet<Character> h = new HashSet<>();  // Creating a HashSet for removing displaying of duplicate characters

        for(int i=0;i<length;i++){
            if(!h.contains(s.charAt(i)))
                System.out.println(s.charAt(i)+" - "+freq[(char)s.charAt(i)+1]);
            h.add(s.charAt(i));
        }
        sc.close();
    }
}
