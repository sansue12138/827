package demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @author liuchang
 * @create 2022-07-17-11:52
 */
public class LotteryTest {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(100) - 10;
        int num2 = random.nextInt(100) - 10;
        System.out.println("中奖号码分别为：" + num1 + "\t" + num2);

        Scanner scanner = new Scanner(System.in);
        int userNum1 = scanner.nextInt();
        int userNum2 = scanner.nextInt();

        if (num1 == userNum1 && num2 == userNum2) {
            System.out.println("恭喜获得奖金10000美元！");
        } else if (num1 == userNum2 && num2 == userNum1) {
            System.out.println("恭喜获得奖金3000美元！");
        } else if ((num1 == userNum1 && num2 != userNum2) || (num1 != userNum1 && num2 == userNum2)) {
            System.out.println("恭喜获得奖金1000美元！");
        } else if ((num1 == userNum2 && num2 != userNum1) || (num1 != userNum2 && num2 == userNum1)) {
            System.out.println("恭喜获得奖金500美元！");
        } else {
            System.out.println("您未中奖！彩票作废！");
        }


    }
}
