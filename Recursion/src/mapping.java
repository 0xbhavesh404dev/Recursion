import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class mapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // First loop: take input
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Second loop: update frequency map
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
           // countMap.put(arr[i],+1);
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequencies
        System.out.println("Frequency of each number:");
        for (HashMap.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        sc.close();
    }
}
