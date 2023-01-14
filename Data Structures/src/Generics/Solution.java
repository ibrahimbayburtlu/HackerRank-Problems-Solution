package Generics;

public class Solution {
    static <T> void printArray(T  t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        Solution obj=new Solution();
        obj.printArray(1);
        obj.printArray(2);
        obj.printArray(3);
        obj.printArray("Hello");
        obj.printArray("World");
    }
}