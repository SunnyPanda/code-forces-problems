import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int m = in.nextInt();
        final int n = in.nextInt();

        final int dominoes = m * n / 2;
        System.out.println(dominoes);
    }
}
