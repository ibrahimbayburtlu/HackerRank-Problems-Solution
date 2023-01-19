package ExceptionHandlingTryCatch;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();

            int z=x/y;
            System.out.println(z);


        }
        catch( InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");

        }
        catch(ArithmeticException  e)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
