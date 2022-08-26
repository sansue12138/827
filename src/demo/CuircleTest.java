package demo;


/**
 * @author liuchang
 * @Create 2022-07-19-0:14
 */
public class CuircleTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 150; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " foo");
            }
            if (i % 5 == 0) {
                System.out.println(i + " biz");
            }
            if (i % 7 == 0) {
                System.out.println(i + " baz");
            }
            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println(i);
            }

        }

    }
}
