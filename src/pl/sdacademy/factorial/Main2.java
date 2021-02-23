package pl.sdacademy.factorial;

import java.util.Arrays;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        //int[] data = new int[]{10, 2, 3, 1, 8, 0};
        Random random = new Random();
        int[] values = new int[100];
        for (int i =0; i< values.length;i++) {
            values[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(values));
        int[] valueBubble = Arrays.copyOf(values,values.length);
        int[] valueQuick = Arrays.copyOf(values,values.length);


        long before = System.nanoTime();
        sort(values);
        long after = System.nanoTime();
        System.out.println(after-before);
        System.out.println(Arrays.toString(values));

        before = System.nanoTime();
        Arrays.sort(valueBubble);
        after = System.nanoTime();
        System.out.println(after-before);
        System.out.println(Arrays.toString(valueBubble));
    }


    public static void sort(int[] values) {
        for (int i = 1; i < values.length; i++) {

            for (int j = 0; j < values.length - i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }

        }
    }
}
