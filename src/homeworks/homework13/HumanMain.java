package homeworks.homework13;

import java.util.ArrayList;

public class HumanMain {

    public static void main(String[] args) {

        ArrayList<Human> children = new ArrayList<>();
        ArrayList<Human> children1 = new ArrayList<>();
        ArrayList<Human> children2 = new ArrayList<>();

        Human mother = new Human("Марія", null, null, children);
        Human father = new Human("Богдан", null, null, children);
        Human human = new Human("Петро", mother, father, new ArrayList<>());
        Human human1 = new Human("Василь", mother, father, new ArrayList<>());

        children1.add(mother);
        children2.add(father);
        children.add(human);
        children.add(human1);

        System.out.println(human);
        System.out.println(human1);
        System.out.println(mother);
        System.out.println(father);
    }

}
