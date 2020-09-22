import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int operations = in.nextInt();
        int result = 0;
        for (int i = 0; i < operations; i++) {
            if (in.next().contains("++")) {
                result++;
            } else {
                result--;
            }
        }
        System.out.println(result);
    }
}
