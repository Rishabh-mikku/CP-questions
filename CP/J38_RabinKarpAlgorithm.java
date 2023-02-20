// Given a text txt[0. . .n-1] and a pattern pat[0. . .m-1], write a function search(char pat[], char txt[]) that prints all occurrences of pat[] in txt[]. You may assume that n > m.

// Examples: 

// Input:  txt[] = “THIS IS A TEST TEXT”, pat[] = “TEST”
// Output: Pattern found at index 10

// Input:  txt[] =  “AABAACAADAABAABA”, pat[] =  “AABA”
// Output: Pattern found at index 0
//               Pattern found at index 9
//               Pattern found at index 12



public class J38_RabinKarpAlgorithm {

    void RabinKarpAlgorithm(String text, String pattern){
        int n = text.length();
        int m = pattern.length();
        int q = 11;
        int d = 256;
        int h = 1;   // for calculating hash value
        int p = 1;   //calculating hash value of a pattern
        int t = 1;   //calculating hash value of a text
        // The value of hash would be (d^m-1)%q
        for(int i=0;i<m;i++)
            h = (h*d)%q;
        
        // Calculating the hash value of pattern and first window of text
        for(int i=0;i<m;i++){
            p = (d*p + pattern.charAt(i))%q;
            t = (d*t + text.charAt(i))%q;
        }

        //Creating window
        for(int i=0;i<n-m;i++){
            // Checking the hash value of pattern and text
            int j;
            if(p == t){
                for(j=0;j<m;j++){
                    if(text.charAt(j+i) != pattern.charAt(j))
                        break;
                }

                if(j == m)
                    System.out.print(i+" ");
            }

            //Calculating hash value of next window
            if(i<n-m){
                t = (d*(t - text.charAt(i)*h)+text.charAt(i+m))%q;

                if(t<0)
                    t = t+q;
            }
        }


        

    }
    public static void main(String[] arg){
        J38_RabinKarpAlgorithm obj = new J38_RabinKarpAlgorithm();
        obj.RabinKarpAlgorithm("GEEKS FOR GEEKS", "GEEK");
    }
    
}
