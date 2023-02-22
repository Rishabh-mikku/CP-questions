// Write an efficient program to print all the duplicates and their counts in the input string 

// Method 1: Using hashing

// Algorithm: Let input string be “geeksforgeeks” 

// Construct character count array from the input string.
// count[‘e’] = 4 
// count[‘g’] = 2
// count[‘k’] = 2 
// ……

import java.util.*;

public class J44_DuplicateElemetsString {

    void duplicate_Elements_String(String s){

        char[] c = s.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for(char i:c){
            if(hm.containsKey(i))
                hm.put(i, hm.get(i)+1);
            else
                hm.put(i, 1);
        }

        for(Map.Entry entry : hm.entrySet())
            System.out.println(entry.getKey()+" - "+entry.getValue());
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();

        J44_DuplicateElemetsString obj = new J44_DuplicateElemetsString();
        obj.duplicate_Elements_String(s);
        sc.close();
    }
}
