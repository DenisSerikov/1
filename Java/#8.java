import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Первая длинна: ");
        double a = scan.nextDouble();
        System.out.print("Вторая длинна: ");
        double b = scan.nextDouble();
        System.out.print("Третья длинна: ");
        double c = scan.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            double cosA = (b * b + c * c - a * a) / (2 * b * c);
            double cosB = (a * a + c * c - b * b) / (2 * a * c);
            double cosC = (a * a + b * b - c * c) / (2 * a * b);
            double angleA = Math.toDegrees(Math.acos(cosA));
            double angleB = Math.toDegrees(Math.acos(cosB));
            double angleC = Math.toDegrees(Math.acos(cosC));
            double maxAngle = Math.max(Math.max(angleA, angleB), angleC);
            System.out.println("Максимальный внешний угол: " + maxAngle);
        } else {
            System.out.println("Треугольник невозможен");
        }
        scan.close();
    }
}