import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String highName = "", highId = "";
        String lowName = "", lowId = "";

        int high = -1;
        int low = 101;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String id = sc.next();
            int score = sc.nextInt();

            if (score > high) {
                high = score;
                highName = name;
                highId = id;
            }

            if (score < low) {
                low = score;
                lowName = name;
                lowId = id;
            }
        }

        System.out.println(highName + " " + highId);
        System.out.println(lowName + " " + lowId);

        sc.close();
    }
}