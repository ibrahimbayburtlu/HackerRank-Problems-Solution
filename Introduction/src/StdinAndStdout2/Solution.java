package StdinAndStdout2;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int integerNumber = input.nextInt();
        double doubleNumber = input.nextDouble();
        input.nextLine();
        String stringExpression = input.nextLine();

        System.out.println("String: "+stringExpression);
        System.out.println("Double: "+doubleNumber);
        System.out.println("Int: "+integerNumber);
    }
}
