package introduction;

public class SquaresOfASortedArray {
	public int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (Math.abs(nums[j]) > Math.abs(nums[j + 1])) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		return nums;
	}
}
