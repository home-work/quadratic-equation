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
    }
}
