package test;

/**
 * @author liuchang
 * @Create 2022-08-19-14:15
 */
public class InstanceTest {
    public static void main(String[] args) {
    Phone phone =new Phone();
    phone.sendEmail();
    phone.playGame();

    //匿名

    }
}
class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发邮件");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}
