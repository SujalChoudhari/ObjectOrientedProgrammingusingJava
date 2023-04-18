import java.util.*;

public class Expriment6 {
    public static void main(String[] args) {
        System.out.println("Enter A number: ");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();

        float sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += 1 / i ^ 2;
        }

        System.out.println(sum);
    }
}
