package demo;

import java.util.Scanner;

/**
 * @author liuchang
 * @create 2022-07-16-23:52
 */


public class ScannerTest {
    public static void main(String[] args) {
//        键盘输入三个整数进行从小到大排序
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int temp = 0;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("从小到大输出为：" + num1 + "\t" + num2 + "\t" + num3);


//        if (score == 100) {
//            System.out.println("奖励一辆BMW");
//        } else if (score > 80 ) {
//            System.out.println("奖励一台IPhoneX");
//        } else if (score >= 60 ) {
//            System.out.println("奖励一个iPad");
//        } else {
//            System.out.println("无法获得任何奖励！");
//        }



      /*  System.out.println("请输入您的姓名：");
        String name = scanner.next();
        System.out.println(name);

        System.out.println("请输入您的年龄：");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("请输入您的体重：");
        double weight = scanner.nextDouble();
        System.out.println(weight);

        System.out.println("您是否已阅读《用户须知》?(true/false)");
        boolean userNotes = scanner.nextBoolean();
        System.out.println(userNotes);*/

    }
}
