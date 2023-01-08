package EndOfFile;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        while (input.hasNext()){
            String nextToken = input.nextLine();
            arr.add(nextToken);
        }
        for (int i = 1; i <= arr.size();i++){
            System.out.println(i + " "+ arr.get(i-1));
        }
        input.close();
    }
}