package homeworks.homework14.Coffe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BeveragesMain {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    static int PRICE_AMERICANO = 25;
    static int PRICE_CAPPUCCINO = 26;
    static int PRICE_LATTE = 27;
    static int PRICE_TEA = 20;

    public static void main(String[] args) throws IOException {
        ArrayList<Beverages> beverages = createAndFillOrder();
        prepare(beverages);
        System.out.println(beverages);
        sum(beverages);
    }

    public static ArrayList<Beverages> createAndFillOrder() throws IOException {
        ArrayList<Beverages> beverages = new ArrayList<>();
        System.out.println("Введи КУПИТИ, чи будь-що інше для виходу: ");
        while (READER.readLine().equals("КУПИТИ")) {
            System.out.println("Вибери напій за номером: ");
            System.out.println("1.Амерікано " + PRICE_AMERICANO + " грн");
            System.out.println("2.Капучіно " + PRICE_CAPPUCCINO + " грн");
            System.out.println("3.Лате " + PRICE_LATTE + " грн");
            System.out.println("4.Чай " + PRICE_TEA + " грн");
            int number = Integer.parseInt(READER.readLine());

            Beverages drink = null;
            switch (number) {
                case 1 -> drink = new Americano("Амерікано", PRICE_AMERICANO);
                case 2 -> drink = new Cappuccino("Капучіно", PRICE_CAPPUCCINO);
                case 3 -> drink = new Latte("Лате", PRICE_LATTE);
                case 4 -> drink = new Tea("Чай", PRICE_TEA);
                default -> System.out.println("Нічого не замовив? То чому прийшов?");
            }
            if (drink != null) {
                beverages.add(drink);
            }
            System.out.println("Введи КУПИТИ, чи будь-що інше для виходу: ");
        }
        return beverages;
    }

    public static void prepare(ArrayList<Beverages> beverages) {
        for (Beverages drink : beverages) {
            drink.prepare();
        }
    }

    public static void sum(ArrayList<Beverages> beverages) {
        int sum = 0;
        for (Beverages drink : beverages) {
            sum += drink.getPrice();
        }
        System.out.println("До сплати " + sum + " грн");
    }
}
