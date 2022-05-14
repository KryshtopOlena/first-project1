package homework.homework3;

public class Task1 {
    public static void main(String[] args) {
        double R1 = 0.2;
        double R2 = 0.5;
        double R3 = 1;
        double density = 0.7;
        double V1 = 4 / 3 * Math.PI * Math.pow(R1, 3);
        double V2 = 4 / 3 * Math.PI * Math.pow(R2, 3);
        double V3 = 4 / 3 * Math.PI * Math.pow(R3, 3);
        int results = (int) (density * (V1 + V2 + V3));
        System.out.println("Маса сніговика складає " + results + "кг");

    }
}