package Introduction;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        System.out.println(word1.length() + word2.length());
        System.out.println(word1.compareTo(word2) > 0 ? "Yes" : "No");
        System.out.println(word1.substring(0,1).toUpperCase() + word1.substring(1) + " "+word2.substring(0,1).toUpperCase()+word2.substring(1));
    }
}