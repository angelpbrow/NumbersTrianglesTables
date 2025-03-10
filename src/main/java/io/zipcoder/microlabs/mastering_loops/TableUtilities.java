package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    public static void printRow(int n, int cols) {
        int i = 1;
        while (i <= cols) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static String getMultiplicationTable(int tableSize) {

        int i = 1;
        while (i <= tableSize) {
            printRow(i, tableSize);
            i = i +1;
        }
        return null;
    }

    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }
}
