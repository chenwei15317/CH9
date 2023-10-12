public class Ex907 {
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        int x1 = 2;
        int n1 = 5;
        int x2 = 3;
        int n2 = 2;

        int result1 = power(x1, n1); // 計算 2 的 5 次方
        int result2 = power(x2, n2); // 計算 3 的 2 次方

        int finalResult = power(result1, result2); // 計算 (2^5) 的 (3^2) 次方

        System.out.println("(2 的 5 次方) 的 (3 的 2 次方) 等於 " + finalResult);
    }
}