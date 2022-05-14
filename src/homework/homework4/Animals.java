package homework.homework4;

public class Animals {
    public static int eatCat() {
        int cat = 8;
        int perDayPortion = 3;
        int period = 30;
        int perPeriodPortion = perDayPortion * period;
        int allCat = cat * perPeriodPortion;
        System.out.println("Котики за місяць зїдають " + allCat + " порцій корму");
        return allCat;

    }

    public static void main(String[] args) {

        int moneyPerPortion = 2;
        int allMoney = (eatCat() + eatDog()) * moneyPerPortion;
        System.out.println("За місяць на годування тварин притулок витрачає " + allMoney + " грн");
    }


    public static int eatDog() {

        int dog = 20;
        int perDayPortion = 3;
        int period = 30;
        int perPeriodPortion = perDayPortion * period;
        int allDog = perPeriodPortion * dog;
        System.out.println("Собаки за місяць зїдають " + allDog + " порцій корму");
        return allDog;

    }

}


