

public class Lcm {
    public static void main(String[] args) {

        int n1 = 15;
        int n2 = 5;

        int num = 1;
        int sum = 1;

        for (int i = 2; i < n1 || i< n2 ; i++) {
            if(n1%i == 0){
                num = num*i;
            }
            if(n2 %i ==0){
                sum = sum * i;
            }
        }
        System.out.println("LCM = "+num*sum);


    }
}
