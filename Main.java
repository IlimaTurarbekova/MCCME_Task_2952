import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        a = a * n;
        b = b * n;
        System.out.println(a + b / 100 + " " + b % 100);
    }
}
