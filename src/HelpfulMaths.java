import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sum = in.next();

        String[] summans = sum.split("\\+");
        String result = Arrays.stream(summans)
                .sorted()
                .collect(Collectors.joining("+"));
        System.out.println(result);
    }
}
