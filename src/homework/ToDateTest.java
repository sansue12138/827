package homework;

import java.util.Scanner;

/**
 * @author liuchang
 * @Create 2022-07-18-23:12
 */
public class ToDateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();

        System.out.println("请输入月份：");
        int month = scanner.nextInt();

        System.out.println("请输入第几天：");
        int day = scanner.nextInt();

/*判断是2019年的第几天
        switch (month){
            case 1:
                System.out.println("这是2019年的第"+day+"年");
                break;
            case 2:
                System.out.println("这是2019年的第"+(day+31)+"年");
                break;
            case 3:
                System.out.println("这是2019年的第"+(day+31+28)+"年");
                break;
            case 4:
                System.out.println("这是2019年的第"+(day+31+28+31)+"年");
                break;
            case 5:
                System.out.println("这是2019年的第"+(day+31+28+31+30)+"年");
                break;
            case 6:
                System.out.println("这是2019年的第"+(day+31+28+31+30+31)+"年");
                break;
            case 7:
                System.out.println("这是2019年的第"+(day+31+28+31+30+31+30)+"年");
                break;
            case 8:
                System.out.println("这是2019年的第"+(day+31+28+31+30+31+30+31)+"年");
                break;
            case 9:
                System.out.println("这是2019年的第"+(day+31+28+31+30+31+30+31+31)+"年");
                break;
            case 10:
                System.out.println("这是2019年的第"+(day+31+28+31+30+31+30+31+31+30)+"年");
                break;
            case 11:
                System.out.println("这是2019年的第"+(day+31+28+31+30+31+30+31+31+30+31)+"年");
                break;
            case 12:
                System.out.println("这是2019年的第"+(day+31+28+31+30+31+30+31+31+30+31+30)+"年");
                break;
        }

**/


        //判断是某年某月的第几天
        int sumday = 0;
        switch (month) {
            case 12:
                sumday += 30;
            case 11:
                sumday += 31;
            case 10:
                sumday += 30;
            case 9:
                sumday += 31;
            case 8:
                sumday += 31;
            case 7:
                sumday += 30;
            case 6:
                sumday += 31;
            case 5:
                sumday += 30;
            case 4:
                sumday += 31;
            case 3:
                sumday += 28;
            case 2:
                sumday += 31;
            case 1:
                sumday += day;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            if (month > 2) {
                System.out.println("这是" + year + "年的第" + (sumday + 1) + "天");
            }
        } else {
            System.out.println("这是" + year + "年的第" + sumday + "天");
        }

    }
}
