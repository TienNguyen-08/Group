package toan;
import java.util.Scanner;
public class toan {
	public static void main(String[] args) {
        int a, b;
        char kt;
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("nhap a: ");
        a = scanner.nextInt();
        System.out.println("nha b : ");
        b = scanner.nextInt();
        System.out.println("Nhap phep toán (+, -, *, /): ");
        kt = scanner.next().charAt(0);
         
        switch (kt) {
        case '+':
            System.out.println(a + " + " + b + " = " + (a + b));
            break;
        case '-':
            System.out.println(a + " - " + b + " = " + (a - b));
            break;
        case '*':
            System.out.println(a + " * " + b + " = " + (a * b));
            break;
        case '/':
            if (b == 0) {
                System.out.println("b khac 0");
            } else {
                System.out.println(a + " / " + b + " = " + 1.0*a / b);
            }
            break;
        default:
            System.out.println("nhap lai");
        }
    }

}