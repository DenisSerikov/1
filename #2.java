import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Информация о работниках предприятия: ");
        String userVvod = vvod.nextLine();
        String[] inputArray = userVvod.replaceAll("[^01]+", "").split("");
        boolean[] n = new boolean[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            n[i] = inputArray[i].equals("1");
        }
        int nCount = 0;
        for (boolean isEmployee : n) {
            if (isEmployee) {
                nCount++;
            }
        }
        System.out.println("Кол-во работников предприятия: " + nCount);
    }
}
