package leetcode1004;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] A = {1,1,1,0,0,0,1,1,1,1,0,1};
		
		int K = 2;
		
		System.out.println("Input: " + Arrays.toString(A) + " K: " + K);
		
		FindMaxConsecutiveWithReplacementFunction solution = new FindMaxConsecutiveWithReplacementFunction();
		
		System.out.println("Solution: " + solution.longestOnes(A, K));
	}
}
