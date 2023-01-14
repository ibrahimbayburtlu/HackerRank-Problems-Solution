package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n;i++){
            int size = input.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < size; j++){
                int item = input.nextInt();
                list.add(item);
            }
            arr.add(list);
        }
        int totalPrint = input.nextInt();
        for (int k = 0; k < totalPrint;k++){
            int row = input.nextInt();
            int col = input.nextInt();

            try
            {
                System.out.println(arr.get(row-1).get(col-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}
