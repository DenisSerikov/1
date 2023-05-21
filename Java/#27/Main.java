import java.util.Scanner;
public class Main {
    public static String[] scannerFunction() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку, сдвиг и направление: ");
        return in.nextLine().split(" ");
    }
    public static void main(String[] args) {
        String[] a = scannerFunction();
        Main1 line = new Main1(a[0], Integer.parseInt(a[1]), a[2]);
        System.out.println(line.encrypt());
    }
}