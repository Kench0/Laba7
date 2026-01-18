import java.util.Scanner;

public class timus1457 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }
        System.out.printf("%.6f\n", sum / n);
    }
}