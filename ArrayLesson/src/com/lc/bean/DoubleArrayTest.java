package com.lc.bean;

/**
 * @author liuchang
 * @Create 2022-08-03-14:49
 */
public class DoubleArrayTest {
    public static void main(String[] args) {
//        1.静态二维数组声明
        int array[][] = new int[][]{{1, 3, 5}, {42, 54, 12, 7543}, {12, 43, 234}};
        double array1[][] =new double[3][2];
//        2.动态二维数组声明
//        int arr[][] = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
