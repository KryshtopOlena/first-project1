package homework3;

public class Task {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        a = 10*1000;
        float c = (a / b)/1000f;
        System.out.println("Тис.кроків/год " + c );
        int steps = 10;
        int time = 12;
        float results = (float) steps / time;
        System.out.println( "Тис.кроків/год " + results);

    }
}
