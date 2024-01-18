package arrays;
public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int[] integerArray = {5, 2, 9, 1, 7, 3};

        int[] result = findLargestAndSmallest(integerArray);

        System.out.println("Largest number: " + result[0]);
        System.out.println("Smallest number: " + result[1]);
    }

    public static int[] findLargestAndSmallest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null; // Handle empty array case
        }

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }

        return new int[]{largest, smallest};
    }
}