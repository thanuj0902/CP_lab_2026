import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int n = scanner.nextInt();

    
        int[] counts = new int[100];

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            counts[number]++;
        }

      
        for (int i = 0; i < 100; i++) {
            System.out.print(counts[i] + " ");
        }

        
    }
}
