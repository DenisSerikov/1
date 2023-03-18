import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = input.nextInt();
        int s = Integer.MAX_VALUE;
        int num = 0;
        for (int i = 0; i <= a; i++) {
            int dif = Math.abs((i * i) - a);
            if (dif < s) {
                s = dif;
                num = i;
            }
        }
        System.out.println("Ближайший квадрат числа "+ num);
    }
}