package Loops2;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int[] a = new int[q];
        int[] b = new int[q];
        int[] n = new int[q];
        for (int i = 0; i < q; i++) {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
            n[i] = input.nextInt();
        }
        for (int i = 0; i < q; i++){
            int total = a[i];
            for (int j = 0; j < n[i];j++){
                total += Math.pow(2,j)*b[i];
                System.out.print(total+" ");
            }
            System.out.println();
        }
    }
}