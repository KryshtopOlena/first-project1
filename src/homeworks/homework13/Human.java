package homeworks.homework13;

import java.util.ArrayList;

public class Human {

    String name;
    Human Mother;
    Human Father;
    ArrayList<Human> children;

    public Human(String name, Human mother, Human father, ArrayList<Human> children) {
        this.name = name;
        this.children = children;
        this.Mother = mother;
        this.Father = father;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("Ім'я: ").append(name);
        text.append(" (мати: ").append(Mother);
        text.append("; батько: ").append(Father).append(")");

        int childSum = this.children.size();
        if(childSum > 0){
            text.append(", діти: ").append(this.children.get(0).name);
            for (int i = 1; i < childSum; i++) {
                Human Child = this.children.get(i);
                text.append(", ").append(Child.name);
            }
        }
        return text.toString();
    }
}

