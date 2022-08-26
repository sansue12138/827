package demo;

/**
 * @author liuchang
 * @Create 2022-07-26-0:03
 */
public class ForFotTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n < i + 1; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
