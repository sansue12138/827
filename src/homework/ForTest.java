package homework;

import java.util.Scanner;

/**
 * @author liuchang
 * @Create 2022-07-20-0:19
 */
public class ForTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        int reminder = 0;
        int n = scanner.nextInt();
        int m = scanner.nextInt(); //较大数
//求最大公约数：（辗转相除法）
        int x = m;
        int y = n;
        if (m > n) {
            temp = m;
            m = n;
            n = temp;
        }
        while (m % n != 0) {
            reminder = m % n;
            m = n;
            n = reminder;
        }
        System.out.println("最大公约数：" + n);
        System.out.println("最小公倍数：" +x*y/n);



    }
}
