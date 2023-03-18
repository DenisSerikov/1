import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Введите число: ");
            int inpNum = scan.nextInt();
            if (i == 0 || inpNum > num[0]) {
                num[2] = num[1];
                num[1] = num[0];
                num[0] = inpNum;
            } else if (i == 1 || inpNum > num[1]) {
                num[2] = num[1];
                num[1] = inpNum;
            } else {
                num[2] = inpNum;
            }
        }
        System.out.println(num[0] + ", " + num[1] + ", " + num[2]);
    }
}