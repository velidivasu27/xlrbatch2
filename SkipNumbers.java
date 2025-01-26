
    public class SkipNumbers {
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                // Skip numbers 5 and 7
                if (i == 5 || i == 7) {
                    continue;
                }
                System.out.println(i);
            }
        }
    } 

