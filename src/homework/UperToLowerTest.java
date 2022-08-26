package homework;

import java.util.Scanner;

/**
 * @author liuchang
 * @Create 2022-07-18-22:38
 */
public class UperToLowerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        //单个字符翻译
//        char c = word.charAt(0);
//        switch (c){
//            case 'a':
//                System.out.println("A");
//                break;
//            case 'b':
//                System.out.println("B");
//                break;
//            case 'c':
//                System.out.println("C");
//                break;
//            case 'd':
//                System.out.println("D");
//                break;
//            case 'e':
//                System.out.println("E");
//                break;
//            default:
//                System.out.println("other");
//                break;
//        }

        //多个字符翻译
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)){
                case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
            }
        }
    }
}
