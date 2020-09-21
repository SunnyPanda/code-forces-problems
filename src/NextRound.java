import java.util.Arrays;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int n = in.nextInt();
        final int k = in.nextInt();

        in.nextLine();
        int[] scores = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int place = scores[k - 1];
        long counter = Arrays.stream(scores)
                .filter(score -> score > 0 && score >= place)
                .count();
        System.out.println(counter);
    }
}
