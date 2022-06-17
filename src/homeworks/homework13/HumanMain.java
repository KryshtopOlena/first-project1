package homeworks.homework13;

public class HumanMain {

    public static void main(String[] args) {

        Human grandfather = new Human("Дмитро", null, null);
        Human grandmother = new Human("Софія", null, null);

        Human father = new Human("Богдан", grandmother, grandfather);
        Human mother = new Human("Марія", null, null);

        Human petro = new Human("Петро", mother, father);
        Human vasyl = new Human("Василь", mother, father);

        System.out.println(grandfather);
        System.out.println(grandmother);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(petro);
        System.out.println(vasyl);
    }

}
