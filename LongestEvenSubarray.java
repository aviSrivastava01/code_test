import java.util.ArrayList;

public class Solution {

    private static int findLongestEvenSubarray(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0;

        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right < numbers.length) {
            if (numbers[right] % 2 == 0) {
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                right++;
                left = right;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 6, 1, 8, 10, 12, 3, 4};
        int[] arr2 = {7, 9, 11, 13};
        int[] arr3 = {2, 4, 6, 8, 10};
        System.out.println(findLongestEvenSubarray(arr1));
        System.out.println(findLongestEvenSubarray(arr2));
        System.out.println(findLongestEvenSubarray(arr3));
    }

}


