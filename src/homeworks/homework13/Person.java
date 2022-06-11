package homeworks.homework13;

public class Person {

    String name;
    String surname;
    int age;
    int weight;
    int growth;

    public Person(String name, String surname, int age, int weight, int growth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", growth=" + growth +
                '}';
    }
}
