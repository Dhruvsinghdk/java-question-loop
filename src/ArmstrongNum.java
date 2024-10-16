


public class ArmstrongNum {

    public static void arm( int n){
        int sum = 0;
        int temp = n;
        while(n!=0){
            int r = n%10;
            sum =  sum + r*r*r;
            n = n/10;
        }
        if(temp == sum){
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            arm(i);
        }
    }
}
