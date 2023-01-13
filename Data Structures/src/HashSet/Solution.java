package HashSet;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here
        Set<String> set = new HashSet<String>();
        int count = 0;
        for(int i=0; i<pair_left.length; i++){
            String temp = pair_left[i]+ " " + pair_right[i];
            set.add(temp);
            System.out.println(set.size());

        }
    }
}
