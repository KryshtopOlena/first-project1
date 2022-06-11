package homeworks.homework13;

public class PersonMain {

    static String[] NAMES = {"Іван", "Степан", "Микола", "Петро", "Арсен"};
    static String[] SURNAMES = {"Іваненко", "Бондаренко", "Костенко", "Щур", "Дюков"};


    public static void main(String[] args) {
        int size = 100;

        Person[] group = createAndFillArray(size);
        print(group);
    }

    public static Person[] createAndFillArray(int size) {
        Person[] group = new Person[size];
        for (int i = 0; i < group.length; i++) {
            String name = randomString(NAMES);
            String surname = randomString(SURNAMES);
            int age = randomInt(40, 30);
            int weight = randomInt(90, 70);
            int growth = randomInt(185, 170);
            Person person = new Person(name, surname, age, weight, growth);
            group[i] = person;
        }
        return group;
    }

    public static int randomInt(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static String randomString(String[] str) {
        int index = (int) (Math.random() * str.length);
        return str[index];
    }

    public static void print(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
