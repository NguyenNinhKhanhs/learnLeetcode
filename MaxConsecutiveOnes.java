package introduction;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int length = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				length++;
				if (max < length) {
					max = length;
				}
			} else {
				length = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 0, 1, 1, 1 };
		MaxConsecutiveOnes a = new MaxConsecutiveOnes();
		int max = a.findMaxConsecutiveOnes(array);

		System.out.println(max);
	}
}
