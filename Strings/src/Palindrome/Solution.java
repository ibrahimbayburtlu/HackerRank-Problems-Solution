package Palindrome;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String word = input.next();
        StringBuilder reverseStr = new StringBuilder();
        int strLength = word.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr.append(word.charAt(i));
        }

        if (word.toLowerCase().equals(reverseStr.toString().toLowerCase())) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
