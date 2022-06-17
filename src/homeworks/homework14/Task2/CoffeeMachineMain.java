package homeworks.homework14.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoffeeMachineMain {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        CoffeeMachine drink = new CoffeeMachine(" Напій");
        int priceAmericano = 25;
        int priceCappuccino = 26;
        int priceLatte = 27;
        int priceTea = 20;
        int sum = 0;
        ArrayList<CoffeeMachine> coffees = createAndFillOrder(priceAmericano, priceCappuccino, priceLatte, priceTea, sum);
        printReceipt(coffees);
        prepare(coffees);
        System.out.println(drink);
    }

    public static ArrayList<CoffeeMachine> createAndFillOrder(int a, int b, int c, int d, int sum) throws IOException {
        ArrayList<CoffeeMachine> coffees = new ArrayList<>();
        System.out.println("Введи КУПИТИ, чи будь-що інше для виходу: ");
        while (READER.readLine().equals("КУПИТИ")) {
            System.out.println("Вибери напій за номером: ");
            System.out.println("1.Амерікано - 25 грн");
            System.out.println("2.Капучіно - 26 грн");
            System.out.println("3.Лате - 27 грн");
            System.out.println("4.Чай - 20 грн");
            int number = Integer.parseInt(READER.readLine());
            switch (number) {
                case 1 -> {
                    Americano americano = new Americano("Амерікано", a);
                    sum += americano.getPrice();
                    coffees.add(americano);
                }
                case 2 -> {
                    Cappuccino cappuccino = new Cappuccino("Капучіно", b);
                    sum += cappuccino.getPrice();
                    coffees.add(cappuccino);
                }
                case 3 -> {
                    Latte latte = new Latte("Лате", c);
                    sum += latte.getPrice();
                    coffees.add(latte);
                }
                case 4 -> {
                    Tea tea = new Tea("Чай", d);
                    sum += tea.getPrice();
                    coffees.add(tea);
                }
                default -> System.out.println("Нічого не замовив? То чому прийшов?");
            }
            System.out.println("Введи КУПИТИ, чи будь-що інше для виходу: ");
        }
        System.out.println("До сплати " + sum + " грн");
        return coffees;
    }

    public static void prepare(ArrayList<CoffeeMachine> coffees){
        for (CoffeeMachine drink : coffees) {
            drink.prepare();
        }
    }

    public static void printReceipt(ArrayList<CoffeeMachine> coffees){
        System.out.println(coffees);
    }
}
