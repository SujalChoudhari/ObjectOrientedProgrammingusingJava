public class Expriment3 {
    public static void main(String[] args) {
        long number = Long.parseLong(args[0]);

        int count = 0;

        for (; number > 0; count++) {
            number /= 10;
        }

        System.out.println(count);

    }
}
