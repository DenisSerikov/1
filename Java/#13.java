import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Начальное число: ");
        int beg = input.nextInt();
        System.out.print("Введите шаг: ");
        int step = input.nextInt();
        System.out.print("Введите кол-во шагов: ");
        int countSteps = input.nextInt();
        for (int i = 0; i < countSteps; i++) {
            int num = beg + i * step;
            System.out.print(num + " ");
        }
    }
}