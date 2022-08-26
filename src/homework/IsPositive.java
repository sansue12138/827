package homework;



import java.util.Scanner;

/**
 * @author liuchang
 * @Create 2022-07-25-23:37
 */
public class IsPositive {
    public static void main(String[] args) {
        int postive =0;
        int nagetive =0;
        Scanner scanner =new Scanner(System.in);
        while(true){
            int i = scanner.nextInt();
            if (i > 0) {
                postive++;
            }else if (i<0){
                nagetive++;
            }else {
                break;
            }
        }
        System.out.println("正数的个数为"+postive);
        System.out.println("负数的个数为"+nagetive );

    }
}
