


public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        int sum = 0;
        int temp = n;

        while(n!=0){
            int r = n%10;
            sum = sum*10 + r;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("Plindrome no.");
        }
        else{
            System.out.println("Not");
        }
    }
}
