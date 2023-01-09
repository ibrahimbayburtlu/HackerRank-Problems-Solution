package BigInteger;

import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String number1 = input.next();
        String number2 = input.next();

        BigInteger multiply;
        BigInteger sum;

        BigInteger a = new BigInteger(number1);
        BigInteger b = new BigInteger(number2);

        multiply = a.multiply(b);
        sum = a.add(b);

        System.out.println(sum);
        System.out.println(multiply);
    }
}