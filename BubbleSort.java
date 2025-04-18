package com.satellite.algorithm.recursion;

import java.util.Arrays;

/**
 * 递归实现冒泡排序
 */
public class BubbleSort {

    private static void bubbleSort(int[] arr, int right) {
        if (right == 0) {
            return;
        }

        for (int left = 0; left < right; left++) {
            if (arr[left] > arr[left + 1]) {
                int temp = arr[left];
                arr[left] = arr[left + 1];
                arr[left + 1] = temp;
            }
        }

        bubbleSort(arr, right - 1);

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};
        bubbleSort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
