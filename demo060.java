public class demo060 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 1, nextNum;

        System.out.println("Fibonacci series from 1 to 20: ");

        while (true) {
            nextNum = num1 + num2;
            if (nextNum > 20) break;
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
}