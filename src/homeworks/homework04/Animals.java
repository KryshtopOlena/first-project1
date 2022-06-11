package homeworks.homework04;

public class Animals {

    public static void main(String[] args) {

        int cat = 8;
        int dog = 20;
        int perDayPortion = 3;
        int period = 30;
        int moneyPerPortion = 2;
        int perPeriodPortion = period * perDayPortion;
        int catPortions = calculatePortions(cat, perPeriodPortion);
        int dogPortions = calculatePortions(dog, perPeriodPortion);
        int allMoney = calculateExpenses(moneyPerPortion, catPortions + dogPortions);
        System.out.println("Котики за місяць зїдають " + catPortions + " порцій корму");
        System.out.println("Собаки за місяць зїдають " + dogPortions + " порцій корму");
        System.out.println("За місяць на годування тварин притулок витрачає " + allMoney + " грн");
    }

    public static int calculatePortions(int cat, int sumPortion) {
        return cat * sumPortion;
    }

    public static int calculateExpenses(int moneyPerPortion, int portions) {
        return moneyPerPortion * portions;
    }

}


