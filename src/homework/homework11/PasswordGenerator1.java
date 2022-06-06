package homework.homework11;

public class PasswordGenerator1 {
    public static void main(String[] args) {
        int size = 8;
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String punctuation = "_";
        String password = (lower + upper + digits + punctuation);
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                j = (int) (Math.random() * password.length());
                System.out.print(password.charAt(j));
            }

        }
    }
}
