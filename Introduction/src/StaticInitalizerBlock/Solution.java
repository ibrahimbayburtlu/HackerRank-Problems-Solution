package StaticInitalizerBlock;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int breath = input.nextInt();
        int height = input.nextInt();

        if (breath > 0 && height > 0){
            System.out.println(breath * height);
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}