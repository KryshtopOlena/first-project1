package homework3;

public class Task2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 8;
        //| a- b | / (a + b) ^3 - √c
        double results = (Math.abs(a - b) / Math.pow(a + b, 3) - Math.sqrt(c));
        System.out.println("Відповідь: " + results);

    }
}
