import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        
        int count = 0;

        while (n > 0) {
            n = n & (n - 1); 
            count++;
        }

        System.out.println(count);

        
    }
}
