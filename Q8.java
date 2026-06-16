import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
            if (words[i].length() > max) {
                max = words[i].length();
            }
        }

        for (String w : words) {
            if (w.length() == max) {
                System.out.println(w);
            }
        }

        sc.close();
    }
}