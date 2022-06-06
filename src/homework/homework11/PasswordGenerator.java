package homework.homework11;

public class PasswordGenerator {
    public static void main(String[] args) {
        int size = 8;
        String lower = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 1; i <= 3; i++) {
            i = (int) (Math.random() * (lower.length()-1));
        }

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 1; i <= 3; i++) {
            i = (int) (Math.random() * (upper.length()-1));
        }
        String digits = "0123456789";
        for (int i = 0; i < 3; i++) {
            i = (int) (Math.random() * (digits.length()-1));
        }
        String punctuation = "_";
        for (int i = 0; i < 1; i++) {
            i = (int) (Math.random() * (punctuation.length()-1));
        }

        String password = (lower+upper+digits+punctuation).toString();
        System.out.println(password);


    }
}
