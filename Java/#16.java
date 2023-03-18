import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int upCount = 0, lowCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                upCount++;
            } else if (Character.isLowerCase(c)) {
                lowCount++;
            }
        }
        if (upCount > lowCount) {
            input = input.toUpperCase();
        } else if (lowCount > upCount) {
            input = input.toLowerCase();
        } else {
            input = input.toLowerCase();
        }
        System.out.println(input);
    }
}