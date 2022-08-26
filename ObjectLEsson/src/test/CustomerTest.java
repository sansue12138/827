package test;

import java.util.Arrays;

/**
 * @author liuchang
 * @Create 2022-08-18-20:33
 */


public class CustomerTest {
    public static void main(String[] args) {
        int arr[] = new int []{4,6,2,2,6,1,8,8};
        Customer customer = new Customer();
        customer.name="Tom";
        customer.getName();
        System.out.println(customer.getName());
        customer.sleep(10);
    }
}

class Customer {
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat() {
        System.out.println("Eating food");
    }

    public String getName() {
        return name;
    }

    public void sleep(int hours) {
        System.out.println("休息了" + hours + "小时");
    }

    public String getNation(String nation) {
        String info = "我的国籍是" + nation;
        return info;
    }


}
