package lessons.lessons11;

import java.util.Arrays;

public class Wix {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*16);
        }
        System.out.println(Arrays.toString(arr));
        int temp = 28;
        for (int i = 0; i < args.length; i++) {
           if (arr[i] + arr[i] == temp){
               System.out.println(arr[i]);
           }

        }
    }
}
