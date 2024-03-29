import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("M: ");
        int M = scanner.nextInt();

        System.out.print("N: ");
        int N = scanner.nextInt();

        System.out.print("Кол-во делителей: ");
        int numDivisors = scanner.nextInt();

        System.out.print("Делители: ");
        int[] divisors = new int[numDivisors];
        for (int i = 0; i < numDivisors; i++) {
            divisors[i] = scanner.nextInt();
        }
        int sum1 = 0;
        for (int divisor : divisors) {
            int sum = 0;
            for (int num = M; num <= N; num++) {
                if (num % divisor == 0) {
                    sum += num;
                }
            }
            sum1 += sum;
        }
        System.out.println("Сумма делителей: " + sum1);
    }
}