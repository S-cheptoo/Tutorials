import java.util.Scanner;
public class TestScanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.print("Enter the first number: + num1");
        System.out.print("Enter the first number: + num2");
        int addition = num1 + num2;

        System.out.println("The result is: " + addition);
    }
}
