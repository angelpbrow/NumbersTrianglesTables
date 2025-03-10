package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numberOfStars; i++) {
            sb.append('*');
        }
        return sb.toString();
        //return null;
    }

    public static String getTriangle(int numberOfRows) {

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < numberOfRows; i++) {
            sb.append(getRow(i)).append("\n");
        }
        return sb.toString();


        //return null;
    }

    // hmm

    public static String getSmallTriangle() {
        return getTriangle(5);
        //return null;
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
        //return null;
    }
}
