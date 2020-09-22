import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = 0;
        int col = 0;
        for (int i = 0; i < 5; i++) {
            String str = in.nextLine().replaceAll(" ", "");
            if (str.contains("1")) {
                row = i + 1;
                col = str.indexOf("1") + 1;
                break;
            }
        }
        int moves = Math.abs(3 - row) + Math.abs(3 - col);
        System.out.println(moves);
    }
}
