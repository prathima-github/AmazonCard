package arraysandstrings;
/**
 * 
 * 

Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49
 *
 */
public class MaxArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}

	public static int maxArea(int[] height) {
		int maxA = 0;
		int i = 0, j = height.length - 1;
		while (i != j) {
			maxA = Math.max(maxA, (j - i) * Math.min(height[i], height[j]));
			if (height[i] > height[j])
				j--;
			else
				i++;
		}
		return maxA;

	}

}
/**
 * Complexity Analysis

    Time complexity : O(n)O(n)O(n). Single pass.

    Space complexity : O(1)O(1)O(1). Constant space is used.

 */
