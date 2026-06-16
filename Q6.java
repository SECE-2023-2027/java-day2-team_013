import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int value = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != value) {
                count++;
            }
        }

        System.out.println("The length of the new array is: " + count);

        sc.close();
    }
}