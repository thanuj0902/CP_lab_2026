import java.util.*;

public class Solution {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
            int n = scanner.nextInt();
            List<Integer> arr = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                    arr.add(scanner.nextInt());  
            }
            List<Integer> result = countingSort(arr); 
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i));
                if (i < result.size() - 1) {
                    System.out.print(" ");
                }
            }
        }
    
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] counts = new int[100];
        
        for (int number : arr) {
            counts[number]++;
        }
        
        List<Integer> sortedList = new ArrayList<>(arr.size());
        for (int value = 0; value < counts.length; value++) {
            while (counts[value] > 0) {
                sortedList.add(value);
                counts[value]--;
            }
        }
        
        return sortedList;
    } 
    
} 
