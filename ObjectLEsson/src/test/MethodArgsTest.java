package test;

/**
 * @author liuchang
 * @Create 2022-08-19-16:01
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest methodArgsTest =new MethodArgsTest();
        methodArgsTest.show(12);
        methodArgsTest.show("Hello,world","Hi");
    }

    public void  show(int i){

     }
    public void show(String ...  strings){

    }

}
