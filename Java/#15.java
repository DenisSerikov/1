import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static String main(String string) {
        String[] a = string.split("\\s+");
        List<String> nRepeatWord = new ArrayList<>();
        for (String word : a) {
            if (!nRepeatWord.contains(word)) {
                nRepeatWord.add(word);
            }
        }
        return String.join(" ", nRepeatWord);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = input.nextLine();
        String print = main(line);
        System.out.println(print);
    }
}