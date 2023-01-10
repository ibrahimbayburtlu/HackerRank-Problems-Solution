package Anagrams;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> mapA = new HashMap<Character, Integer>();
        Map<Character, Integer> mapB = new HashMap<Character, Integer>();
        for (int i = 0; i < a.length();i++){
            int count = mapA.getOrDefault(a.charAt(i), 0);
            mapA.put(a.charAt(i), count + 1);
        }
        for (int i = 0; i < b.length();i++){
            int count = mapB.getOrDefault(b.charAt(i), 0);
            mapB.put(b.charAt(i), count + 1);
        }
        System.out.println(mapA.equals(mapB) ? "Anagrams" : "Not Anagrams");
    }
}