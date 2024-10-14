//Write a program to check whether a number is a Strong Number or not


public class Quest22 {
    public static void main(String[] args) {
        int n = 145;
        int n1 = n;
        int sum = 0;


        while(n!=0){
            int r = n%10;
            int fact = 1;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }
            sum = sum + fact;

            n = n/10;
        }

        System.out.println(sum);
    }

}
