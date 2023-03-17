import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Обозначте длинну массива: ");
        int length = scan.nextInt();

        int[] num = new int[length];
        System.out.print("Введите числа массива: ");
        for (int i = 0; i < length; i++) {
            num[i] = scan.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += num[i] * num[i];
        }

        System.out.println("Сумма квадратов: " + sum);
    }
}

