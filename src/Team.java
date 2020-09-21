import java.util.Arrays;
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int n = in.nextInt();
        in.nextLine();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            final String[] problem = in.nextLine().split(" ");
            int sureCount = Arrays.stream(problem)
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
            if (sureCount >= 2) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
