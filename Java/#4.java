import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ввод строки: ");
        String input = scan.nextLine();
        System.out.print("Ввод символа: ");
        char sim = scan.next().charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == sim) {
                count++;
            }
        }
        System.out.println("Символ" + sim + " встречается " + count + " раз");
    }
}
