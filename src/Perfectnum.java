


public class Perfectnum {
    public static void perfect(int n){

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n%i == 0){
                sum = sum + i;
            }
        }
        if(sum == n){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        for (int i=1; i<= 10000 ; i++){
            perfect(i);
        }

    }
}
