package arrays;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 0, 1, 3, 0, 4};

        System.out.println("Original Array:");
        printArray(numbers);

        moveZerosToEnd(numbers);

        System.out.println("\nArray after moving 0's to the end:");
        printArray(numbers);
    }

    public static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        // Move non-zero elements to the beginning
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Fill the remaining positions with 0
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}