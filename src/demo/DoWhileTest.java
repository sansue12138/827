package demo;

/**
 * @author liuchang
 * @Create 2022-07-25-23:24
 */
public class DoWhileTest {
    public static void main(String[] args) {
//
//        遍历一百以内的偶数
        int i=1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }while (i<=100);
    }

}
