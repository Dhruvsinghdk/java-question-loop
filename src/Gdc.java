//60. Write Java program to Find the (GCD) Greatest Common Divisor

public class Gdc {
    public static void main(String[] args) {
        int n1 = 120;
        int n2 = 24;

        int hcf = 0;
        for (int i = 2; i < n1 || i< n2 ; i++) {
            if(n1%i == 0  && n2%i == 0 ){
                hcf = i;
            }
        }
        System.out.println(hcf);

    }
}
