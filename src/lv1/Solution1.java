package lv1;

import java.util.Arrays;

//바탕화면정리
class Solution1 {
	public static int[] solution(String[] wallpaper) {
		int len = wallpaper.length;
		int lx = Integer.MAX_VALUE;
		int ly = Integer.MAX_VALUE;
		int dx = 0;
		int dy = 0;

		for(int i=0; i<len; i++){
			boolean isLineFileExist = false;
			String[] split = wallpaper[i].split("");

			for(int j=0; j<split.length; j++){
				String c = split[j];
				if(c.equals("#")){
					isLineFileExist = true;
					if(ly > j){
						ly = j;
					}
					if(dy < j+1){
						dy = j+1;
					}
				}
			}

			if(isLineFileExist && lx > i){
				lx = i;
			}
			if(isLineFileExist && dx < i+1){
				dx = i+1;
			}
		}


		return new int[]{lx, ly, dx, dy};
	}

	public static void main(String[] args) {
		Arrays.stream(Solution1.solution(new String[]{".#...", "..#..", "...#."})).forEach(System.out::println);
	}
}