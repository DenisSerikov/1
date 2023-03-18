import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Первая строка: ");
        String firstLine = scan.nextLine();
        System.out.print("Вторая строка: ");
        String sec = scan.nextLine();
        boolean endsWith = firstLine.endsWith(sec);
        if (endsWith) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}