import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        int n = sc.nextInt();

        list.remove(list.size() - n);

        for (int x : list) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}