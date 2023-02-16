import java.util.*;
public class J37_commoneleamong3array {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        //First Array
        int size1 = sc.nextInt();
        int a[] = new int[size1];
        for(int i=0;i<size1;i++)
            a[i] = sc.nextInt();

        //Second Array
        int size2 = sc.nextInt();
        int b[] = new int[size2];
        for(int i=0;i<size2;i++)
            b[i] = sc.nextInt();

        //Third Array
        int size3 = sc.nextInt();
        int c[] = new int[size3];
        for(int i=0;i<size3;i++)
            c[i] = sc.nextInt();

        int total_size = size1+size2+size3;
        int t[] = new int[total_size];  //An array to store all elements of three arrays

        //The idea here is to sort the combinition of three arrays in ascending order and then find frequency of each element. Display those elements which have frequency 3.

        for(int i=0;i<size1;i++)
            t[i] = a[i];
        for(int i=0;i<size2;i++)
            t[i+size1] = b[i];
        for(int i=0;i<size3;i++)
            t[i+size1+size2] = c[i];
            
        Arrays.sort(t); //Sorting the array in ascending order.
        int freq[] = new int[100]; //to store frequency of elements of array t.
        for(int i=0;i<100;i++)
            freq[i] = 0;
        
        for(int i=0;i<total_size;i++)
            freq[t[i]]++;

        for(int i=0;i<100;i++){
            if(freq[i]==3)
                System.out.print(i+" ");
        }

        sc.close();
    }
}
