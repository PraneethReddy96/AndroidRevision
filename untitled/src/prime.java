public class prime {
    public static void main(String[] args) {
        int count = 0;
        for (int n = 1; n <= 100; n++) {
            boolean isPrime = true;

            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {

                    isPrime = false;
                    break;

                }
            }

            if (isPrime && n != 2) {
                count++;
                System.out.println(n );
            }

        }
        System.out.println(count);
    }
}
