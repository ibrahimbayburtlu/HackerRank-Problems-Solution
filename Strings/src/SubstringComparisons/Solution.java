package SubstringComparisons;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String str_temp = new String();
        String str = new String();
        // Complete the function

        str_temp = s.substring(0,k);
        smallest = str_temp;
        largest = str_temp;
        for(int j=0;j<s.length()-(k-1);j++)
        {
            str = s.substring(j,j+k);
            if(smallest.compareTo(str)> 0)
                smallest = str;
        }
        for(int j=0;j<s.length()-(k-1);j++)
        {
            str = s.substring(j,j+k);
            if(largest.compareTo(str)< 0)
                largest = str;
        }
        // 'smallest' must be the lexicographically smallest substring of length  'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int k = input.nextInt();
        System.out.println(getSmallestAndLargest(s,k));

    }
}
