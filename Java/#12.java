import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Первое число: ");
        int n1 = scan.nextInt();
        System.out.print("Второе число: ");
        int n2 = scan.nextInt();
        int min = Math.min(n1, n2);
        for (int i = min; ; i += min) {
            int square = i * i;
            System.out.println(square);
            if (square >= Math.max(n1, n2) * Math.max(n1, n2)) {
                break;
            }
        }
    }
}