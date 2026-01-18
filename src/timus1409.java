import java.util.Scanner;

public class timus1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Garry = in.nextInt();
        int Larry = in.nextInt();

        System.out.println(Math.abs(Garry - 10) + " " + Math.abs(Larry - 10));
    }
}
