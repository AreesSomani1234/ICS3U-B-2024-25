package day5;

public class Arrays2DExamples {
    public static void main(String[] args) {
        int[][] nums = new int[5][3];
        populate2DArray(nums);
        print2DArray(nums);
        System.out.println();
        System.out.println();

        // print1DArray(nums[0]);

        int[] sumRows = arrRowSum(nums);
        print1DArray(sumRows);

        int sum = sumCol(nums, 1);
        System.out.println();
        System.out.println(sum);

        int[] sumCols = arrColSum(nums);
        print1DArray(sumCols);
    }

    private static int[] arrColSum(int[][] arr2D) {
        int[] result = new int[arr2D[0].length];
        for (int col = 0; col < result.length; col++) {
            result[col] = sumCol(arr2D, col);
        }
        return result;
    }

    private static int sumCol(int[][] arr2D, int col) {
        int sum = 0;
        for (int[] row : arr2D) {
            sum += row[col];
        }
        return sum;
    }

    private static int[] arrRowSum(int[][] arr2D) {
        int[] result = new int[arr2D.length]; // arr2D is the number of rows

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                result[row] += arr2D[row][col];
            }
        }
        return result;
    }

    private static void populate2DArray(int[][] arr2D) {
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = (int) (Math.random() * 10) + 1;
            }
            System.out.println();
        }
    }

    private static void print2DArray(int[][] arr2D) {
        // for (int row = 0; row < arr2D.length; row++) {
        // for (int col = 0; col < arr2D[row].length; col++) {
        // System.out.print(arr2D[row][col]);
        // }
        // System.out.println();
        // }
        for (int[] row : arr2D) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void print1DArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

}
