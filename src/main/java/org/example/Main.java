import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int num3 = scanner.nextInt();

        int maxTernary = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println("Maximum using ternary operator: " + maxTernary);

        scanner.close();
    }
}