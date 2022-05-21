package lessons.lessons6;


public class TaskMethods {
    public static void main(String[] args) {
        String test = printMeaning("Hello", 10, 20, 30);
        System.out.println(test);
        int test2 = calculateInt(10, 20, 30);
        System.out.println(test2);

    }
     public static int calculateInt(int a, int b, int c) {
        return a + b + c;
     }

    public static String printMeaning(String message, int a, int b, int c) {
        return message + (a + b + c);
    }
}
