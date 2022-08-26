package ocm.lc.practise;

import java.util.Scanner;

/**
 * @author liuchang
 * @Create 2022-08-03-11:21
 */
public class ArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxScore = 0;
        System.out.println("请输入学生人数：");
        int studentNumber = scanner.nextInt();
        int studentGrades[] = new int[studentNumber];
        System.out.println("请输入" + studentNumber + "个成绩：");
        for (int i = 0; i < studentNumber; i++) {
            studentGrades[i] = scanner.nextInt();
            if (maxScore < studentGrades[i])
                maxScore = studentGrades[i];
        }
        System.out.println("最高分是：" + maxScore);
        for (int i = 0; i < studentNumber; i++) {
            if (studentGrades[i] >= maxScore - 10) {
                System.out.println("Student " + i + " score is " + studentGrades[i] + " grade is A");
            } else if (studentGrades[i] >= maxScore - 20) {
                System.out.println("Student " + i + " score is " + studentGrades[i] + " grade is B");
            } else if (studentGrades[i] >= maxScore - 30) {
                System.out.println("Student " + i + " score is " + studentGrades[i] + " grade is C");
            } else {
                System.out.println("Student " + i + " score is " + studentGrades[i] + " grade is D");
            }
        }
    }
}
