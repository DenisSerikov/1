import java.util.Scanner;
public class Main {
    public static void Method() {
        System.out.println(fun(GetNumber()));
    }
    public static int fun(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 0) { //n / 2 == (int) n / 2
            return fun(n / 2);
        } else {
            return fun((n - 1)/ 2) + fun(((n - 1) / 2) + 1 );
        }
    }
    public static int GetNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Число: ");
        return in.nextInt();
    }
}