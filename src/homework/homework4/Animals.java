package homework.homework4;

public class Animals {

    public static void main(String[] args) {

        int cat = 8;
        int dog = 20;
        int perDayPortion = 3;
        int period = 30;
        int moneyPerPortion = 2;
        int perPeriodPortion = period * perDayPortion;
        int allCat = eatCat(cat, perPeriodPortion);
        int allDog = eatDog(dog, perPeriodPortion);
        int allMoney = sum(allCat, allDog) * moneyPerPortion;
        System.out.println("Котики за місяць зїдають " + eatCat(cat, perPeriodPortion) + " порцій корму");
        System.out.println("Собаки за місяць зїдають " + eatDog(dog, perPeriodPortion) + " порцій корму");
        System.out.println("За місяць на годування тварин притулок витрачає " + allMoney + " грн");
    }

    public static int sum(int cat, int dog) {

        return cat + dog;
    }

    public static int eatCat(int cat, int sumPortion) {



        return cat * sumPortion;

    }

    public static int eatDog(int dog, int sumPortion) {

        return dog * sumPortion;

    }

}


