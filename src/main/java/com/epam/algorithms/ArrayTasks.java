package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = {"winter", "spring", "summer", "autumn"};
        return seasons;

    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] myArr = new int[length];
        for (int i = 0; i < length; i++) {
            myArr[i] = i + 1;
        }
        return myArr;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if(number == arr[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] myArr = new String[arr.length];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = arr[arr.length - 1 - i];
        }
        return myArr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                count++;
            }
        }

        int[] myArr = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                myArr[index] = arr[i];
                index++;
            }
        }
        return myArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int[][] myArr = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            myArr[i] = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                myArr[i][j] = arr[i][j];
            }
        }

        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                for (int k = 0; k < myArr[i].length - 1; k++) {
                    if(myArr[i][k] > myArr[i][k + 1]) {
                        int temp = myArr[i][k];
                        myArr[i][k] = myArr[i][k + 1];
                        myArr[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr.length - 1; j++) {
                if(myArr[j].length > myArr[j + 1].length) {
                    int[] temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
        return myArr;
    }

}
