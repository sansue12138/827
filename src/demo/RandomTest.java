package demo;

import java.util.Random;

/**
 * @author liuchang
 * @create 2022-07-17-12:16
 */
public class RandomTest {
    public static void main(String[] args) {
//        Random random = new Random();
//
//        double num1 = random.nextDouble()*10-1;
//        System.out.println(num1);
//
//        int num2 = random.nextInt(8)+2;
//        System.out.println(num2);


        Random random = new Random();
        int value= random.nextInt(9)+1;
        System.out.println(value);
    }
}
