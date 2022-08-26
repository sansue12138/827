package com.lc.bean;

import java.util.Arrays;
import java.util.Random;

/**
 * @author liuchang
 * @Create 2022-08-01-12:06
 */
public class ArrayTest {
    public static void main(String[] args) {
//      将六个不同的整数存到数组中
        int array[] = new int[6];
        int temp = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[0] = random.nextInt(7) + 1;
            } else {
                label:
                while (true) {
                    temp = random.nextInt(7) +1;
                    for (int j = 0; j < i; j++) {
                        if (array[j] == temp) {
                            continue label;
                        }
                    }
                    array[i] = temp;
                    break;
                }
            }
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
