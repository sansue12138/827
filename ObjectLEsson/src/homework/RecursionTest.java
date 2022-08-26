package homework;

/**
 * @author liuchang
 * @Create 2022-08-19-18:31
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest recursionTest = new RecursionTest();
        System.out.println(recursionTest.f(10));
    }

    public int f(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f(n + 2) - 2 * f(n + 1);
        }
    }
}
