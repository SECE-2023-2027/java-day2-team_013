import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];

        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;

        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}