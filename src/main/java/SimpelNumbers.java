public class SimpelNumbers {
    public static void main(String[] args) {
        int m = 11;
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                System.out.println("Не простое число");
                return;
            }
        }
        System.out.println("Простое число");
    }
}
