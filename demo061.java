public class demo061 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 10 are: ");
        for (int num = 2; num <= 10; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
            public static boolean isPrime(int number) {
                if (number <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }