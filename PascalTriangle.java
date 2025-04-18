package com.satellite.algorithm.recursion;

/**
 * 杨辉三角
 * 行 i, 列 j, 那么 [i][j] 的值为: [i-1][j-1] + [i-1][j]
 * 当 j=0 或 i=j 时, [i][j] 取值为 1
 */
public class PascalTriangle {

    private static int element(int i, int j) {
        if (j == 0 || i == j) {
            return 1;
        }
        return element(i - 1, j - 1) + element(i - 1, j);
    }

    /**
     * 打印杨辉三角
     * @param n
     */
    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(element(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // System.out.println(element(4, 2));
        print(5);
    }

}
