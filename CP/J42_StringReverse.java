// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

 

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]
 

// Constraints:

// 1 <= s.length <= 105
// s[i] is a printable ascii character.

import java.util.*;

public class J42_StringReverse {

    String ReverseString(String s){
        String str="";
        // First Method - initialising loop control variable i with last element and then extracting ith character from string s and concatinating in it second string str
        // for(int i=s.length()-1;i>=0;i--)
        //     str = str + s.charAt(i);

        //Second Method - initialising loop control variable i with first element and then extracting ith character from string s and adding it in reverse order in str
        for(int i=0;i<s.length();i++)
            str = s.charAt(i)+str;

        return str;
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse it");
        String s = sc.nextLine();

        J42_StringReverse obj = new J42_StringReverse();
        String rev_string = obj.ReverseString(s);
        System.out.println(rev_string);

        sc.close();        
    }
    
}
