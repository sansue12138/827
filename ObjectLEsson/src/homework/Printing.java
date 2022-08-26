package homework;

/**
 * @author liuchang
 * @Create 2022-08-18-22:43
 */
public class Printing {
    public static void main(String[] args) {
    Printing printing =new Printing();
    int area =printing.method();
        System.out.println(area);
    }
//    public void method(){
//        for (int i=0;i<10;i++){
//            for (int j=0;j<8;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    public int method(){
        for (int i=0;i<10;i++){
            for (int j=0;j<8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 10*8;
    }
}

