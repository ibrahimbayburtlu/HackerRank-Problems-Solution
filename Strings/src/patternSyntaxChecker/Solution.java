package patternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = Integer.parseInt(input.nextLine());
        while(N>0){
            String pattern = input.nextLine();
            try{
                Pattern reg = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e){
                System.out.println("Invalid");
            } finally {
                N--;
            }
        }
    }
}

