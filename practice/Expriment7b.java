public class Expriment7b {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        /**
         * Print a patters
         * A
         * CB
         * FED
         * JIHG
         */
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print((char) (count + j + 64));

            }
            count += i;
            System.out.println();
        }
    }
}
