import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int[] colSum = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;

            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                rowSum += a[i][j];
                colSum[j] += a[i][j];
                total += a[i][j];
            }

            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(rowSum);
        }

        for (int j = 0; j < n; j++) {
            System.out.print(colSum[j] + " ");
        }
        System.out.println(total);

        sc.close();
    }
}