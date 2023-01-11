package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
//YOU SHOULD ONLY SUBMIT THE FOLLOWING BLOCK
class MyRegex {
    String Limit_0_255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = Limit_0_255 + "\\." + Limit_0_255
            + "\\." + Limit_0_255
            + "\\." + Limit_0_255;
}