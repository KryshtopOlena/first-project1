package lessons.lesson09;

public class Task {

    public static void main(String[] args) {
        int x = 10, z = 10;
        x++;
        System.out.println(x);
        ++z;
        System.out.println(z++);
        System.out.println(z);
        System.out.println(++z + 2);
        System.out.println(++z + z++ + z++);
        System.out.println(z++);

    }

}
