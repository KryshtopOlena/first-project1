package homeworks.homework13;

import java.util.ArrayList;

public class HumanMain {

    public static void main(String[] args) {

        ArrayList<Human> children = new ArrayList<>();
        ArrayList<Human> children1 = new ArrayList<>();
        ArrayList<Human> children2 = new ArrayList<>();

        Human human = new Human("Софія", null, null, children2);
        Human human1 = new Human("Марія", null, null, children);
        Human human2 = new Human("Богдан", human, null, children);
        Human human3 = new Human("Петро", human1, human2, new ArrayList<>());
        Human human4 = new Human("Василь", human1, human2, new ArrayList<>());

        children1.add(human);
        children2.add(human2);
        children.add(human3);
        children.add(human4);

        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human);
    }

}
