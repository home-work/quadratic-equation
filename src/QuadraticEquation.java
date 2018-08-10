import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        //Nhập vào hệ số của phương trình
        System.out.println("\tGIẢI PHƯƠNG TRÌNH BẬC 2   0 = Ax^2 + Bx + C");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hệ số a:");
        float a = scanner.nextFloat();
        System.out.println("Nhập vào hệ số b:");
        float b = scanner.nextFloat();
        System.out.println("Nhập vào hệ số c:");
        float c = scanner.nextFloat();

        //Giải phương trình
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else
                    System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có 1 nghiệm duy nhất x = " + (0 - c) / b);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b) / (2 * a));
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                System.out.println("x1 = " + ((-b) + Math.sqrt(delta)) / (2 * a));
                System.out.println("x2 = " + ((-b) - Math.sqrt(delta)) / (2 * a));
            }

        }
    }
}
