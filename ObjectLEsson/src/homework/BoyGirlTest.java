package homework;

/**
 * @author liuchang
 * @Create 2022-08-20-19:57
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy =new Boy("梁山伯",22);
        Girl girl =new Girl("祝英台",21);
        Girl girl1 =new Girl("孙二娘",54);

        boy.marry(girl);
        boy.shout();
        girl.marry(boy);
        System.out.println(girl.compare(girl1));
    }
}
