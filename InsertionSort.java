package com.satellite.algorithm.recursion;

import java.util.Arrays;

/**
 * 递归实现插入排序
 */
public class InsertionSort {

    /**
     * 插入排序
     * @param arr 待排序数组
     * @param low 未排序的最左边元素索引
     */
    public static void insertionSort(int[] arr, int low) {

        if (low == arr.length) {
            return;
        }
        int temp = arr[low];
        int i = low - 1;  // 已排序的数组最右边索引

        while ( i >= 0 && arr[i] > temp) {  // 未找到插入位置
            arr[i + 1] = arr[i];  // 空出插入位置
            i--;
        }

        // 找到插入位置
        arr[i + 1] = temp;

        insertionSort(arr, low + 1);

    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 4};
        insertionSort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
