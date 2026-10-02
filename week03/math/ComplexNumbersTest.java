import java.util.Scanner;

public class ComplexNumbersTest {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(1, 2);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println("c1.re() = " + c1.re());
        System.out.println("c1.imag() = " + c1.imag());

        System.out.println("c1.equals(c2) = " + c1.equals(c2));
        System.out.println("c1.equals(new ComplexNumber(3, 4)) = " + c1.equals(new ComplexNumber(3, 4)));

        System.out.println("c1.conjugate() = " + c1.conjugate());
        System.out.println("c1.abs() = " + c1.abs());

        System.out.println("c1.add(c2) = " + c1.add(c2));
        System.out.println("c1.sub(c2) = " + c1.sub(c2));
        System.out.println("c1.mult(c2) = " + c1.mult(c2));

        System.out.println("c1.pow(3) = " + c1.pow(3));

        // Extra: exponentiation with user input (x + yi)^n
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("enter x: ");
        double x = scanner.nextDouble();
        System.out.println("enter y: ");
        double y = scanner.nextDouble();
        System.out.println("enter n: ");
        int n = scanner.nextInt();

        ComplexNumber c = new ComplexNumber(x, y);
        System.out.println("(" + c + ")^" + n + " = " + c.pow(n));

        scanner.close();
    }
}