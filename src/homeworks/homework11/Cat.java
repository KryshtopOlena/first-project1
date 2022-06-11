package homeworks.homework11;

public class Cat {

    String name;
    int ageMonth;
    int weight;
    String breed;

    public Cat() {
    }

    public Cat(String name, int ageMonth, int weight, String breed) {
        this.name = name;
        this.ageMonth = ageMonth;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, int ageMonth) {
        this.name = name;
        this.ageMonth = ageMonth;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name= '" + name + '\'' +
                ", ageMonth= " + ageMonth +
                ", weight= " + weight +
                ", breed= '" + breed + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat cat) {
            return this.weight == cat.weight && this.ageMonth == cat.ageMonth;
        }
        return false;
    }
}
