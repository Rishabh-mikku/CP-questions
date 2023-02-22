// Given a string S, check if it is palindrome or not.

// Example 1:

// Input: S = "abba"
// Output: 1
// Explanation: S is a palindrome
// Example 2:

// Input: S = "abc" 
// Output: 0
// Explanation: S is not a palindrome
 

// Your Task:
// You don't need to read input or print anything. Complete the function isPalindrome()which accepts string S and returns an integer value 1 or 0.

// Expected Time Complexity: O(Length of S)
// Expected Auxiliary Space: O(1)


// Constraints:
// 1 <= Length of S<= 105

import java.util.*;

public class J43_PalindromeString {

    // The logic of the solution is to check the characters of string from front and back
    // If the mismatch is found than the function will return false indicating "Not a Palindrome String"
    // else return true indicating "A Palindrome String"
    // loop is running from i=0 to i=string.length()/2
    
    boolean PalindromeString(String s){
        // int flag=0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();

        J43_PalindromeString obj = new J43_PalindromeString();
        if(obj.PalindromeString(s))
            System.out.println("A Palindrome String");
        else
            System.out.println("Not a Palindrome String");

        sc.close();
    }
}
