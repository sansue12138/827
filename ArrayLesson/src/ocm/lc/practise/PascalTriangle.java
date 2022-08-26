package ocm.lc.practise;

/**
 * @author liuchang
 * @Create 2022-08-06-10:51
 */

//杨辉三角
public class PascalTriangle {
    public static void main(String[] args) {
        int[][] triangle = new int[10][10];
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j <=i; j++) {
                if (i ==  j || j == 0) {
                    triangle[i][j]=1;
                }else {
                    triangle[i][j]= triangle[i-1][j-1]+triangle[i-1][j];
                }
                System.out.print(triangle[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
