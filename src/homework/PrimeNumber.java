package homework;

import java.lang.ref.SoftReference;

/**
 * @author liuchang
 * @Create 2022-07-26-17:01
 */
public class PrimeNumber {
    public static void main(String[] args) {
//        输出一百以内的质数

        long start = System.currentTimeMillis();
       label: for (int i = 2; i <=100 ; i++) {
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue   label;
                }
            }
           System.out.print(i +" ");
        }
        System.out.println();
        long end =System.currentTimeMillis();
        System.out.println(start);
        System.out.println(end);
        System.out.println("运行时间为："+(end-start));

    }
}
