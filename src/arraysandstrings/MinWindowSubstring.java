package arraysandstrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(minWindow("ADOBECODEBANC", "ABC"));
		// System.out.println(minWindow("a","a"));
		// System.out.println(minWindow("ab", "a"));
		 //System.out.println(minWindow("abc", "ab"));
		//System.out.println(minWindow("acccbcafbbbbbaaaa", "ab"));
		System.out.println(String.format("id=%08.2f", 423.147));
	}

	public static String minWindow(String s, String t) {
		Map<Character, Integer> tMap = new HashMap<>();
		Map<Character, Integer> windowMap = new HashMap<>();
		if (s == null)
			return null;
		if (t == null)
			return "";
		if (s.equals(t))
			return s;

		for (int i = 0; i < t.length(); i++) {
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
		}

		int left = 0, right = 0;
		int formed = 0;
		int expSize = t.length();
		int[] result = new int[] { -1, 0, 0 };
		while ((left <= right && right < s.length())) {

		
			windowMap.put(s.charAt(right), windowMap.getOrDefault(s.charAt(right), 0) + 1);
			System.out.println("windowMap is - " + windowMap);
			if (tMap.getOrDefault(s.charAt(right), 0) == windowMap.getOrDefault(s.charAt(right), 0)) {
				formed++;

			}
			System.out.println("adding to window map " + s.charAt(right) + "..formed is " + formed);
			System.out.println("left right are - " + left + ".." + right);

			while (right != left && (right - left + 1) > formed && formed == expSize && right < s.length()) {
				windowMap.put(s.charAt(left), windowMap.getOrDefault(s.charAt(left), 0) - 1);
				if (!tMap.containsKey(s.charAt(left))) {
					System.out.println("check1" + s.charAt(left));
					left++;
					//if (left != right && )
						continue;
				}  if (tMap.getOrDefault(s.charAt(left), 0) < windowMap.getOrDefault(s.charAt(left), 0)) {
					left++;

					System.out.println("check2" + s.charAt(left));
					//if (left != right)
						continue;
				} 
					
					windowMap.put(s.charAt(left), windowMap.getOrDefault(s.charAt(left), 0) + 1);
				
			

				windowMap.put(s.charAt(right), windowMap.getOrDefault(s.charAt(right), 0) - 1);
				if (!tMap.containsKey(s.charAt(right))) {
					System.out.println("check4" + s.charAt(right));
					right--;
					//if (left != right)
						continue;
				} else if (tMap.getOrDefault(s.charAt(right), 0) < windowMap.getOrDefault(s.charAt(right), 0)) {
					right--;
					System.out.println("check5" + s.charAt(right));
					//if (left != right)
						continue;
				} else {

					// windowMap.put(s.charAt(right),windowMap.getOrDefault(s.charAt(right),0)+1);
					windowMap.put(s.charAt(right), windowMap.getOrDefault(s.charAt(right), 0) + 1);
				}

				

				break;

			}
			if(formed == expSize) {
			System.out.println("check6 creating resultset ");
			if (result[0] == -1 || result[0] > right - left + 1) {
				result[0] = right - left + 1;
				result[1] = left;
				result[2] = right;
				System.out.println("result is " + Arrays.toString(result));
			}
			left = right + 1;
			formed = 0;
			windowMap.clear();
			}
			right++;
		}

		return result[0] == -1 ? "" : s.substring(result[1], result[2] + 1);
	}

}
