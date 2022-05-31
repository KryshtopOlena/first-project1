package lessons.lessons10;

public class Square {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" # ");
            }
            System.out.println();
        }
        String str = " # ";
        for (int i = 0; i < 10; i++){
            System.out.println(str);
            str = str + " # ";
        }
    }
}
