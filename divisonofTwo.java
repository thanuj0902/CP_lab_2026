import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int dividend = sc.nextInt();
         int divisor = sc.nextInt();
        
    System.out.println(divide(dividend, divisor));
        
    }
     public static int divide(int dividend, int divisor) {
        
        int quo = dividend / divisor;
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        return quo;
    }
}
