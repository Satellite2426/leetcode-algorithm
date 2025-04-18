package com.satellite.algorithm.recursion;

import java.util.Arrays;

/**
 * 递归实现斐波那契数列
 * if n=0 return 0;
 * if n=1 return 1;
 * if n>1 return f(n-1)+f(n-2);
 */
public class Fibonacci {
    public static int f(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }

    /**
     * 兔子问题(斐波那契) - 递归实现
     * 第一个月 有 1 对兔子
     * 第二个月 有 1 对兔子
     * 第三个月 有 2 对兔子
     * 第四个月 有 3 对兔子
     * ....
     * 即:
     * if n = 1 return 1;
     * if n = 2 return 1;
     * if n > 2 return rabbit(n-1) + rabbit(n-2);
     *
     * @param n 第 n 个月
     */
    public static int rabbit(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return rabbit(n - 1) + rabbit(n - 2);

    }

    /**
     * 青蛙跳台阶问题(斐波那契) - 递归实现
     * 青蛙要爬到楼顶，可以一次跳一个台阶，也可以一次跳两个台阶
     * 楼梯有n阶，只能向上跳，有多少种跳
     * 即:
     * if n = 1 return 1;
     * if n = 2 return 2;
     * if n = 3 return 3;
     * if n > 3 return frog(n-1) + frog(n-2);
     *
     * @param n
     * @return
     */
    public static int frog(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        return frog(n - 1) + frog(n - 2);

    }

    /**
     * 斐波那契 优化  记忆法
     * 将重复的计算记录入一个数组
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;

        return f1(n, cache);
    }

    private static int f1(int n, int[] cache) {
        if (cache[n] != -1) {
            return cache[n];
        }
        int x = f1(n - 1, cache);
        int y = f1(n - 2, cache);
        cache[n] = x + y;
        return cache[n];
    }

    public static void main(String[] args) {
        // System.out.println(f(10));
        // System.out.println(rabbit(6));
        // System.out.println(frog(4));
        System.out.println(fibonacci(13));
    }
}
