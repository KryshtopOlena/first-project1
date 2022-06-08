package homework.homework11;

public class PasswordGenerator {

    public static String lower = "abcdefghijklmnopqrstuvwxyz";
    public static String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String digits = "0123456789";
    public static String punctuation = "_";

    public static void main(String[] args) {
        String password = getPassword();
        System.out.println(password);
    }

    public static String getPassword () {
        String general = lower + upper + digits;
        StringBuilder builder = new StringBuilder();
        builder = builder.append(choose(1, lower))
                .append(choose(1, upper))
                .append(choose(1, digits))
                .append(choose(4, general))
                .append(punctuation);
        return snuffleString(builder.toString());
    }

    public static String choose(int size, String str) {
        String string = "";
        int index;
        for (int i = 0; i < size; i++) {
            index = (int) (Math.random() * str.length());
            string += str.charAt(index);
        }
        return string;
    }

    public static String snuffleString(String symbolsForThePassword) {
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