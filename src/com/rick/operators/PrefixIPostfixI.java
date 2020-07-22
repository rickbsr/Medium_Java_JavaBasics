package com.rick.operators;

public class PrefixIPostfixI {

    public static void main(String[] args) {
    }

    static void printIPlus() {
        int i = 0;
        System.out.print(i++);
        System.out.println(i);
    }

    static void printPlusI() {
        int i = 0;
        System.out.print(++i);
        System.out.println(i);
    }

    static void testIPlus() {
        int i = 0;
        i++;
    }

    static void testPlusI() {
        int i = 0;
        ++i;
    }

    static void testIPlus2() {
        int i = 0;
        System.out.println(i++);
    }

    static void printPlusI2() {
        int i = 0;
        System.out.println(++i);
    }

    static void testDiffIPlusAndPlusI() {
        // diff between ++i and i++
        System.out.println(timingIPlus() - timingPlusI());
    }

    static long timingIPlus() {
        long time = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i == 0) time = System.currentTimeMillis();
            if (i == Integer.MAX_VALUE - 1) time = System.currentTimeMillis() - time;
        }
        return time;
    }

    static long timingPlusI() {
        long time = 0;
        for (int i = 0; i < Integer.MAX_VALUE; ++i) {
            if (i == 0) time = System.currentTimeMillis();
            if (i == Integer.MAX_VALUE - 1) time = System.currentTimeMillis() - time;
        }
        return time;
    }
}

