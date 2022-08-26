package ocm.lc.practise;

import java.util.Scanner;

/**
 * @author liuchang
 * @Create 2022-08-05-11:59
 */
public class ArraySum {
    public static void main(String[] args) {
//        一维数组求和
        /*
        int array[] = new int[]{1,2,3,4,5};
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+= array[i];
        }
        System.out.println(sum);
        */

//        二维数组求和
        int doubleArray[][]= new int[][]{{1,1,1,1,1,1},{2,2,2},{3},{5,5}};
        int sum=0;
        for (int i=0;i<doubleArray.length;i++){
            for (int j=0;j<doubleArray[i].length;j++){
                sum +=doubleArray[i][j];
            }
        }
        System.out.println(sum);
    }
}
