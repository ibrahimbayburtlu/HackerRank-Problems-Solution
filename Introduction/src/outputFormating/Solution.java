package outputFormating;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String[] s1 = new String[3];
        int[] x = new int[3];
        for (int i = 0; i < 3;i++){
            s1[i] = input.next();
            x[i] = input.nextInt();
        }
        System.out.println("================================");
        for (int i = 0; i < 3; i++){
            System.out.printf("%-15s%03d %n",s1[i],x[i]);
        }
        System.out.println("================================");
    }
}
