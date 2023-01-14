package Subarray;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
        }
        input.close();

        int numNegativeSubarrays = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {

                int sum = 0;

                for(int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }

                if(sum < 0) {
                    numNegativeSubarrays++;
                }
            }
        }
        System.out.println(numNegativeSubarrays);
    }
}
