
public class Main {

	public static void main(String args[]) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] answer = twoSum(nums, target);
		System.out.println(answer[0] + "\n" + answer[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = {0, 0};
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i + 1;
					result[1] = j + 1;
					break;
				}
			}
		}
		return result;
	}
}
