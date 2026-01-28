package introduction;

public class findNumbersWithEvenNumberOfDigits {
	public static int numberOfDigits(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
		}
		return count;
	}

	public static int findNumbers(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = numberOfDigits(nums[i]);
			if (count % 2 == 0) {
				index++;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] a = { 12, 345, 2, 6, 7896 };
		int index = findNumbers(a);
		System.out.println(index);
	}
}
