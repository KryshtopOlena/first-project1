package homeworks.homework11;

public class PasswordGenerator {

    public static String LOWER = "abcdefghijklmnopqrstuvwxyz";
    public static String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String DIGITS = "0123456789";
    public static String PUNCTUATION = "_";

    public static void main(String[] args) {
        String password = getPassword();
        System.out.println(password);
    }

    public static String getPassword() {
        String general = LOWER + UPPER + DIGITS;
        StringBuilder builder = new StringBuilder();
        builder = builder.append(choose(1, LOWER))
                .append(choose(1, UPPER))
                .append(choose(1, DIGITS))
                .append(choose(4, general))
                .append(PUNCTUATION);
        return shuffleString(builder.toString());
    }

    public static StringBuilder choose(int size, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int index;
        for (int i = 0; i < size; i++) {
            index = (int) (Math.random() * str.length());
            stringBuilder.append(str.charAt(index));
        }
        return stringBuilder;
    }

    public static String shuffleString(String symbolsForThePassword) {
        char[] symbolsForPassword = symbolsForThePassword.toCharArray();
        int index;
        char temp;
        for (int i = 0; i < symbolsForPassword.length; i++) {
            index = (int) (Math.random() * symbolsForThePassword.length());
            temp = symbolsForPassword[i];
            symbolsForPassword[i] = symbolsForPassword[index];
            symbolsForPassword[index] = temp;
        }
        return new String(symbolsForPassword);
    }
}