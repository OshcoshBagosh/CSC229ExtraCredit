package org.example;

public class PascalTriangle {public static long countNonDivisible(int numRows) {
    long[][] triangle = new long[numRows][numRows];
    long count = 0;

    for (int i = 0; i < numRows; i++) {
        triangle[i][0] = 1;
        triangle[i][i] = 1;

        for (int j = 1; j < i; j++) {
            triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            if (triangle[i][j] % 7 != 0) {
                count++;
            }
        }
    }

    return count;
}

    public static void main(String[] args) {
        int numRows = 100;
        long result = countNonDivisible(numRows);
        System.out.println(result);
    }
}
