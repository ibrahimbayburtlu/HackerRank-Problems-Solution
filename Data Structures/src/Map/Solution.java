package Map;


import java.util.*;

class Solution {
    public static void main(String []argh){
        Map<String,Integer> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i =0; i<n; i++){
            String name=input.nextLine();
            int phone=input.nextInt();
            map.put(name,phone);
            input.nextLine();
        }

        while(input.hasNext())
        {
            String s=input.nextLine();
            System.out.println(map.containsKey(s)?s+"="+map.get(s):"Not found");
        }
    }
}
