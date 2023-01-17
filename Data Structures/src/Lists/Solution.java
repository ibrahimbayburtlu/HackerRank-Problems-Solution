package Lists;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < N;i++){
            arr.add(input.nextInt());
        }
        int queryCount = input.nextInt();
        for (int i = 0; i < queryCount;i++){
            String query = input.next();
            if (query.equals("Insert")){
                int index = input.nextInt();
                int element = input.nextInt();
                arr.add(index,element);
            }else if (query.equals("Delete")){
                int index = input.nextInt();
                arr.remove(index);
            }
        }
        for (int number : arr){
            System.out.print(number + " ");
        }
    }
}