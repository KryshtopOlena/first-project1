package lessons.lesson08;

public class Pin {
    public static void main(String[] args) {
        int number = 9407;
        int units = number % 10;
        System.out.println(units);
        int dozens = (number / 10) % 10;
        System.out.println(dozens);
        int hundreds = (number / 100) % 10;
        System.out.println(hundreds);
        int thousands = (number / 1000) % 10;
        System.out.println(thousands);


        int[] numbers = {thousands, hundreds, dozens, units};
        for (int i = 0; i < numbers.length; i++ ){
            for (int j = 0; j <= 9; j++){
                if (numbers[i] == j) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
