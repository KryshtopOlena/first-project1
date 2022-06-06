package homework.homework11;

public class CatMain {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "Кузя";
        cat.weight = 5;
        cat.ageMonth = 23;
        cat.breed = "Мейн-кун";
        System.out.println(cat);

        Cat cat2 = new Cat("Барсик", 6, 30, "Шартрез");
        System.out.println(cat2);

        Cat cat3 = new Cat("Байрон", 6);
        System.out.println(cat3);
        Cat cat4 = new Cat("Сара", 7);
        System.out.println(cat4);
        System.out.println(cat.equals(cat2));

    }
}