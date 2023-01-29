// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


import java.util.*;
public class J23_longestsubstring {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        // System.out.println(s);
        HashSet<Character> h = new HashSet<Character>();
        int max_length=0, a_pointer=0, b_pointer=0;
        for(int i=0;i<len;i++){
                if(!h.contains(s.charAt(b_pointer)))
                {
                    h.add(s.charAt(b_pointer));
                    b_pointer++;
                    max_length=Math.max(h.size(), max_length);
                }
                else{
                    h.remove(s.charAt(a_pointer));
                    a_pointer++;
                }
                // if(subset_length>max_length)
                // max_length = subset_length;
        }
        System.out.println(max_length);
        sc.close();
    }
    
}
