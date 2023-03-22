package lv1;

import java.util.Arrays;

//덧칠하기
class Solution2 {
	public static int solution(int n, int m, int[] section) {
		int count = 1;
		int cursor = section[0] + m;

		for(int i : section){
			if(i+1 > cursor){
				count++;
				cursor = i + m;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(Solution2.solution(8, 4, new int[]{2, 3, 6}));
	}
}