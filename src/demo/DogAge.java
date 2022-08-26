package demo;

import java.util.Scanner;

/**
 * @author liuchang
 * @create 2022-07-17-11:07
 */
public class DogAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入狗狗的年龄；");
        int dogAge = scanner.nextInt();

        if (dogAge < 0) {
            System.out.println("请输入正确的狗狗年龄！");
        }else if(dogAge <=2) {
            double trueAge = dogAge*10.2;
            System.out.println("狗狗相当于人类的"+trueAge+"岁");
        }else{
            double trueAge = 2*10.5+(dogAge-2)*4;
            System.out.println("狗狗相当于人类的"+trueAge+"岁");
        }
    }
}
