import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstString = in.next().toLowerCase();
        String secondString = in.next().toLowerCase();

        int result = 0;
        for (int i = 0; i < firstString.length() && result == 0; i++) {
            if (firstString.charAt(i) > secondString.charAt(i)) {
                result = 1;
            } else if (firstString.charAt(i) < secondString.charAt(i)){
                result = -1;
            }
        }

        System.out.println(result);
    }
}
