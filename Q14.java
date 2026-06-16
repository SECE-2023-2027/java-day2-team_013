import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        String[] days = {
            "Thursday", "Friday", "Saturday", "Sunday",
            "Monday", "Tuesday", "Wednesday"
        };

        int[] monthDays = {
            31,29,31,30,31,30,31,31,30,31,30,31
        };

        int total = day - 1;

        for (int i = 0; i < month - 1; i++) {
            total += monthDays[i];
        }

        System.out.println(days[total % 7]);

        sc.close();
    }
}