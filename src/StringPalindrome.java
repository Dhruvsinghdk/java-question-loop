
//50. Write a Program to Check Given String is a Palindrome or Not


public class StringPalindrome {
    public static void main(String[] args) {
        String s = "sir";
        char a[] = s.toCharArray();
        String b = "";
        String c = s;

        for (int i = s.length()-1; i >= 0; i--) {
            b = b+ a[i];
        }
        if(c.toLowerCase().equals(b.toLowerCase())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }

    }
}