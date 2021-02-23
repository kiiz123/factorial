package pl.sdacademy.factorial;

public class Main {
    public static void main(String[] args) {
        int[] data = new int[]{1,3,5,10};
        for (int value : data ) {
            System.out.println(value+"!="+factorial(value));
        }
    }

    static long factorial(int value)
    {
        long wynik = 1;

        for (int i = value; i > 0; i--) {
            wynik = wynik*i;
        }
        wynik = 1;
        for (int i = 1; i <= value; i++) {
            wynik = wynik*i;
        }

        return wynik;
    }
}
