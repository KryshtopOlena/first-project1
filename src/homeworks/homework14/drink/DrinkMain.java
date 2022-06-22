package homeworks.homework14.drink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DrinkMain {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    static int PRICE_AMERICANO = 25;
    static int PRICE_CAPPUCCINO = 26;
    static int PRICE_LATTE = 27;
    static int PRICE_TEA = 20;

    public static void main(String[] args) throws IOException {
        ArrayList<Drink> drinks = acceptingOrder();
        prepare(drinks);
        System.out.println(drinks);
        printBill(drinks);
    }

    public static ArrayList<Drink> acceptingOrder() throws IOException {
        ArrayList<Drink> drinks = new ArrayList<>();
        System.out.println("Введи Вийти для виходу, чи будь-що інше для продовження: ");
        while (!(READER.readLine().equalsIgnoreCase("Вийти"))) {
            System.out.println("Вибери напій за номером: ");
            System.out.println("1.Амерікано " + PRICE_AMERICANO + " грн");
            System.out.println("2.Капучіно " + PRICE_CAPPUCCINO + " грн");
            System.out.println("3.Лате " + PRICE_LATTE + " грн");
            System.out.println("4.Чай " + PRICE_TEA + " грн");
            int number = Integer.parseInt(READER.readLine());
            if (number >= 1 && number <= 4) {
                drinks.add(createDrinks(number));
            }
            System.out.println("Введи Вийти для виходу, чи будь-що інше для продовження: ");
        }
        return drinks;
    }

    public static void prepare(ArrayList<Drink> drinks) {
        for (Drink drink : drinks) {
            drink.prepare();
        }
    }

    public static Drink createDrinks(int number){
        Drink drink = null;
            switch (number) {
                case 1 -> drink = new Americano("Амерікано", PRICE_AMERICANO);
                case 2 -> drink = new Cappuccino("Капучіно", PRICE_CAPPUCCINO);
                case 3 -> drink = new Latte("Лате", PRICE_LATTE);
                case 4 -> drink = new Tea("Чай", PRICE_TEA);
            }
            return drink;
    }

    public static void printBill(ArrayList<Drink> drinks) {
        int sum = 0;
        for (Drink drink : drinks) {
            sum += drink.getPrice();
        }
        System.out.println("До сплати " + sum + " грн");
    }

}
