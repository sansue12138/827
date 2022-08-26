package test;

import java.util.Random;

/**
 * @author liuchang
 * @Create 2022-08-19-17:51
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest recursionTest =new RecursionTest();
        System.out.println(recursionTest.getSum(100));
    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }
}
