package demo;

import java.util.Scanner;

/**
 * @author liuchang
 * @create 2022-07-18-18:35
 */
public class LoveTest {
    public static void main(String[] args) {
        //方式一：
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("请输入您的身高(cm)：");
//        int height = scanner.nextInt();
//
//        System.out.println("请输入您的财富状况（千万）：");
//        double deposit = scanner.nextDouble();
//
//        System.out.println("帅否？（true/false）（是/否）");
//        boolean handsomeTest = scanner.nextBoolean();
//
//        if (height > 180 && deposit > 1 && handsomeTest == true) {
//            System.out.println("一定要嫁！");
//        } else if (height > 180 || deposit > 1 || handsomeTest == true) {
//            System.out.println("嫁吧！");
//        }else {
//            System.out.println("不嫁！");
//        }

        //方式二：
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的身高(cm)：");
        int height = scanner.nextInt();

        System.out.println("请输入您的财富状况（千万）：");
        double deposit = scanner.nextDouble();

        System.out.println("帅否？（是/否）");
        String isHandsome = scanner.next();

        if (height > 180 && deposit > 1 && isHandsome.equals("是")) {
            System.out.println("一定要嫁！");
        } else if (height > 180 || deposit > 1 || isHandsome.equals("是")) {
            System.out.println("嫁吧！");
        }else {
            System.out.println("不嫁！");
        }
    }
}
