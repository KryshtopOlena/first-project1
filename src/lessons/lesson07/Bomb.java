package lessons.lesson07;

public class Bomb {
    public static void main(String[] args) throws InterruptedException {
        int i = 10;
        int engineer = (int) (Math.random() * 10);
        System.out.println(engineer);
        do {
            System.out.println("До вибуху залишилось " + i + "сек");
            Thread.sleep(1000);
            i--;

        } while (i > engineer);

        if (engineer == 0){
            System.out.println("Boom!!!");
            return;
        }
            System.out.println("Вітаю! Бомбу знешкоджено ");

    }
}
