package homework;

import java.util.Scanner;

/**
 * @author liuchang
 * @Create 2022-07-18-22:56
 */
public class GradeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的成绩：");

        double score = scanner.nextDouble();
        switch ((int) score/10){
            case 0 :
            case 3 :
            case 1 :
            case 2 :
            case 4 :
            case 5 :
                System.out.println("不及格！");
                break;
            case 7 :
                System.out.println("及格！");
                break;
            case 8 :
                System.out.println("及格！");
                break;
            case 9 :
                System.out.println("及格！");
                break;
            default:
                System.out.println("及格！");
                break;

        }
    }
}
