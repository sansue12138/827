package homework;

import javax.xml.transform.dom.DOMResult;

/**
 * @author liuchang
 * @Create 2022-07-31-17:37
 */
public class PrefectNumber {
    public static void main(String[] args) {
//        int factor = 0;
//        for (int j = 1; j <= 1000; j++) {
//            for (int i = 1; i < j; i++) {
//                if (j % i == 0) {
//                    factor += i;
//                }
//            }
//            if (j == factor) {
//                System.out.println(j);
//            }
//            factor = 0;
//        }


        for (int i=0;i<=6;i++){
            for (int j=6;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
