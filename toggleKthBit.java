import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int n = scanner.nextInt();
        
        int k = scanner.nextInt();

        
        int mask = 1 << k;

        
        int result = n ^ mask;


        System.out.println(result);

    
    }
}
