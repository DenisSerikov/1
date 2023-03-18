import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = input.nextLine();
        String print = line.replaceAll("[АОУЫЭЕЁИЮЯаоуыэеёиюя]", "");
        System.out.println(print);
    }
}
