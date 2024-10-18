
import java.util.*;

public class Rand {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int range = s.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextInt(range));
        }

    }
}
