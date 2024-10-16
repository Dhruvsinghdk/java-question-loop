


public class Prime {
    public static void main(String[] args) {
        int n = 120;
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                System.out.println("Not Prime");
                break;
            }
            System.out.println("Prime");
            break;
        }
    }
}
