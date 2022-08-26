package demo;

/**
 * @author liuchang
 * @create 2022-07-16-14:51
 */


/*
* &和&&的区别：&&是短路与，开发效率较高；&开发效率较低，在开发中优先使用短路与
* 相同点1：两者的运行结果都是一样的
* 相同点2：当符号左边是True时，两者都会执行符号右边的运算
* 不同点：当符号左边是False时，&会继续执行右边的运算，而&&不会在执行右边的运算，从而提升了运行效率
*
*
* |和||的区别： ||是短路或，开发效率较高；|的开发效率较低，开发中优先使用||
* 相同点1：；两者的运行结果都相同、
* 相同点2：当符号左边是False时就要执行符号右边的运算
* 不同点：当符号左边是true时，||就不需要执行符号右边的运算。|就需要执行符号右边的运算
* */
public class LogicTest {
    public static void main(String[] args) {
//        &和&&的区别
//        boolean b1 = true;
//        int num1 = 10;
//        if(b1 & (num1++ >10)){
//            System.out.println("北京");
//        }
//        else{
//            System.out.println("南京");
//        }
//        System.out.println("num1 :" +num1);
//
//
//        boolean b2 = false;
//        int num2 = 10;
//        if(b2 && (num2++ >10)){//未执行右边的运算
//            System.out.println("北京");
//        }
//        else{
//            System.out.println("南京");
//        }
//        System.out.println("num2 :" +num2);



        boolean a1 = true;
        int num3 = 10;
        if (a1 | (num3++ >10)){
            System.out.println("北京");
        }
        else{
            System.out.println("南京");
        }

        System.out.println("num3 :"+num3);


        boolean a2 = true;
        int num4 = 10;
        if (a2 | (num4++ >10)){
            System.out.println("北京");
        }
        else{
            System.out.println("南京");
        }

        System.out.println("num4 :"+num4);
    }
}
