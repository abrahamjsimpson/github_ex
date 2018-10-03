package puzzles;


/**
 * problems pulled from codingbat.com
 *
 * @author codingbat.com
 */
public class Puzzles {
/*
F or each of the below method signatures, finish implementing the method
 */
    /**==================SUM~28==============/
     * Problem statement:
         * Given an array of ints,
         * return true if the sum of all the 2's
         * in the array is exactly 8.
     * Example input -> output:
         * sum28([2, 3, 2, 2, 4, 2]) → true
         * sum28([2, 3, 2, 2, 4, 2, 2]) → false
         * sum28([1, 2, 3, 4]) → false
     */
    public static boolean sum28(int[] input) {
        //TODO
        return false;
    }

    /**==================SUM~28==============/
     * Problem statement:
         * Given an array of ints, return true if every element is a 1 or a 4.
     * Example input -> output:
         * only14([1, 4, 1, 4]) → true
         * only14([1, 4, 2, 4]) → false
         * only14([1, 1]) → true
     */
    public static boolean only14(int[] input) {
        //TODO
        return false;
    }

    public static void main (String[] args) {
        {
            System.out.print("sum28: ");
            boolean sum28Correct = true;
            int[][] testInput = new int[][]{
                    {2, 3, 2, 2, 4, 2}, //true
                    {1, 2, 3, 4},       //false
                    {2},                //false

            };
            boolean[] output = new boolean[]{
                    true, false, false
            };
            for (int i = 0; i < 3; i++) {
                if (sum28(testInput[i]) != output[i]) {
                    System.out.println("FAIL");
                    sum28Correct = false;
                    continue;
                }
            }
            if (sum28Correct)
                System.out.println("PASS");
            System.out.println("--------------");
        }
        {
            System.out.print("only14: ");
            boolean only14Correct = true;
            int[][] testInput = new int[][]{
                    {1, 4, 1, 4}, //true
                    {1, 4, 2, 4}, //false
                    {1, 1, 1, 5}, //false

            };
            boolean[] output = new boolean[]{
                    true, false, false
            };
            for (int i = 0; i < 3; i++) {
                if (sum28(testInput[i]) != output[i]) {
                    System.out.println("FAIL");
                    only14Correct = false;
                    continue;
                }
            }
            if (only14Correct)
                System.out.println("PASS");
            System.out.println("--------------");
        }
    }
}
