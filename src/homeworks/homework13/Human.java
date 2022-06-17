package homeworks.homework13;

public class Human {

    String name;
    Human mother;
    Human father;

    public Human(String name, Human mother, Human father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        String s = "";
        s += name;
        if (mother == null) {
            s += "";
        } else {
            s += " : (мати - " + mother;
        }
        if (father == null) {
            s += "";
        } else {
            s += ", батько - " + father + ")";
        }
        return s;
    }
}