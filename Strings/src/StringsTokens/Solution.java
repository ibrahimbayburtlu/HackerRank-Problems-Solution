package StringsTokens;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine().trim();

        String[] tokens = sentence.split("[^\\p{Alpha}]+");

        int size = (sentence.isEmpty()) ? 0 : tokens.length;
        System.out.println(size);

        for (String s : tokens){
            System.out.println(s);
        }
    }
}