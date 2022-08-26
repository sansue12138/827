package homework;

/**
 * @author liuchang
 * @Create 2022-07-24-0:18
 */
public class OddSum {
    public static void main(String[] args) {
// （1）   求100以内奇数和

//        int sum =0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                sum +=i;
//            }
//        }
//        System.out.println("100以内的奇数和为"+sum);


// （2）     求100以内7的倍数的整数个数及其总和

//        int sum = 0;
//        int numberSeven = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 7 == 0) {
//                numberSeven++;
//                sum += i;
//            }
//        }
//        System.out.println("100以内7的倍数个数为"+numberSeven);
//        System.out.println("100以内7的倍数总和为"+sum);


//   （3） 输出所有的水仙花数

        for (int i = 100; i <= 999; i++) {
            if (Math.pow(i / 100, 3) + Math.pow(i % 10, 3) + Math.pow(i / 10 % 10, 3) == i) {
                System.out.print(i);
                System.out.print("\t");
            }
        }
    }


}
