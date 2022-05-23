package lessons.lessons4;

public class Box {
    public static void main(String[] args) {
        int height = 100;
        int length = 200;
        int width = 300;
        int volume = calculateVolume(height,length, width);
        System.out.println(volume);
        System.out.println(calculateVolume(345,465,587) );
    }
    public static int calculateVolume(int height,int length,int width){

        return height * length * width;

    }
}
