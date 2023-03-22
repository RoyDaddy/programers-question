package lv1;

import java.util.Arrays;

//대충 만든 자판
class Solution3 {
	public static int[] solution(String[] keymap, String[] targets) {
		int[] result = new int[targets.length];

		int idx = 0;
		for(String str : targets){
			int count = 0;
			for(String c : str.split("")){
				int findCount = Arrays.stream(keymap)
					.filter(k -> {
						boolean t = k.contains(c);
						return k.contains(c);
					})
					.map(k -> {
						int t = k.indexOf(c);
						return t;
					})
					.mapToInt(i -> i)
					.filter(i -> i != -1)
					.min()
					.orElse(-1);

				if(findCount == -1){
					count = -1;
					break;
				}
				count += findCount+1;
			}
			result[idx] = count;
			idx++;
		}

		return result;
	}

	public static void main(String[] args) {
//		System.out.println(Solution3.solution());
//		Arrays.stream(Solution3.solution(new String[]{}, new String[]{})).forEach(System.out::println);
		Arrays.stream(Solution3.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"})).forEach(System.out::println);
	}
}