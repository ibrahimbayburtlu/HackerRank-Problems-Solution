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
