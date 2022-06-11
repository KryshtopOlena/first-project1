package homeworks.homework07;

public class LuckyNumber {

    public static void main(String[] args) {
        int unlucky1 = 4;
        int unlucky2 = 9;
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == unlucky1 || (i / 10) % 10 == unlucky1 || i % 10 == unlucky2 || (i / 10) % 10 == unlucky2) {
                continue;
            }
            System.out.println(i);
        }
    }
}
