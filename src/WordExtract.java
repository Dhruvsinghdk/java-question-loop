


public class WordExtract {
    public static void main(String[] args) {
        String s = "java tutor php python";
        String a[] = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
