package DataTypes;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int count=input.nextInt();
        for(int i=0; i<count; i++) {
            try {
                long n = input.nextLong();
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) System.out.println("* byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) System.out.println("* short");
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) System.out.println("* int");
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) System.out.println("* long");

            } catch (Exception ex) {
                System.out.println(input.next() + " can't be fitted anywhere.");
            }
        }
    }
}