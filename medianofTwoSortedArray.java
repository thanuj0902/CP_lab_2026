import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
            
            int ar[] = new int[m];
            for(int i = 0; i < m; i++) {
                ar[i] = sc.nextInt();
                }
                
                int all[] = new int[n + m];
                
                for(int i = 0; i < n; i++) {
                    all[i] = arr[i];
                    }
                    
                    for(int i = 0; i < m; i++) {
                        all[n + i] = ar[i];
                        }
                        
                        Arrays.sort(all);
                        
                        int len = n + m;
                        
                        if(len % 2 == 0) {
                            double median = (all[len/2 - 1] + all[len/2]) / 2.0;
                                System.out.println(median);
                                } else {
                                    System.out.println(all[len/2]);
                                    }
        
    }
}
