package test;

/**
 * @author liuchang
 * @Create 2022-08-19-14:42
 */
public class OverLoadTest {
    //    重载：在同一个个类中，允许有一个以上的同名方法，但其参数个数或是参数类型不同（参数列表不同）
    public static void main(String[] args) {
//    OverLoadTest overLoadTest =new OverLoadTest();
//    overLoadTest.mOL(2);
//    overLoadTest.mOL(7,9);
//    overLoadTest.mOL("中国");
        OverLoadTest overLoadTest =new OverLoadTest();
        System.out.println(overLoadTest.getMax(3,6));
        System.out.println(overLoadTest.getMax(2.1,5.3));
        System.out.println(overLoadTest.getMax(9.8,6.1,5.0));
    }

//    public void mOL(int field){
//        System.out.println("运算结果为："+field*field);
//    }
//    public void mOL(int field,int field1){
//        System.out.println("运算结果:"+field*field1);
//    }
//    public void mOL(String str){
//        System.out.println(str);
//    }



    public int getMax(int number1, int number2) {
       return (number1>number2)?number1:number2;
    }

    public double getMax(double number1, double number2) {
        if (number1 > number2) {
            return number1;
        }
        return number2;
    }

    public double getMax(double number1, double number2, double number3) {
        double max = 0;
        if (number1 > number2 && number1 > number3) {
            max = number1;
        }
        if (number3 > number1 && number3 > number2) {
            max = number3;
        }
        if (number2 > number3 && number2 > number1) {
            max = number2;
        }
        return max;
    }
}
