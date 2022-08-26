package demo;

/**
 * @author liuchang
 * @create 2022-07-16-17:24
 */
public class SanYuanTest {
        public static void main(String[] args) {
            //    获取两个数字中的最大值
            int m =12;
            int n = 3;
            System.out.println((m < n) ? m : n);

//            获取三个数字中的最大值

            int num1 = 100;
            int num2 = 110;
            int num3 = 120;
            int max1 = (num1 > num2)? num1 : num2;
            int max2 = (max1 >num3)? max1 : num3;

            System.out.println("三个数字中最大数字是：" +max2);

            int max3 = (((num1 > num2)?num1 : num2) > num3)?((num1 > num2)?num1:num2):num3;
            System.out.println("三个数字中最大数字是：" +max3);
}

}
