import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;


        for (int i = 1; i <= 3; i++) {
            int a = s.nextInt();
            sum = sum + a;
        }

        System.out.println("Sum = "+sum);

    }
}
