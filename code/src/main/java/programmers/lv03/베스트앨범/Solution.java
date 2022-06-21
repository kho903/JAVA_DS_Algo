package programmers.lv03.베스트앨범;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	static class Music {
		String genre;
		int plays;
		int idx;

		public Music(String genre, int plays, int idx) {
			this.genre = genre;
			this.plays = plays;
			this.idx = idx;
		}
	}

	public static int[] solution(String[] genres, int[] plays) {

		int arrLen = genres.length;
		Map<String, Integer> mapPlays = new HashMap<>();

		for (int i = 0; i < arrLen; i++) {
			mapPlays.put(genres[i], mapPlays.getOrDefault(genres[i], 0) + plays[i]);
		}

		ArrayList<String> genreOrder = new ArrayList<>();
		while (!mapPlays.isEmpty()) {
			int max = 0;
			String maxGenre = "";
			for (String key : mapPlays.keySet()) {
				Integer value = mapPlays.get(key);
				if (max < value) {
					max = value;
					maxGenre = key;
				}
			}
			genreOrder.add(maxGenre);
			mapPlays.remove(maxGenre);
		}
		ArrayList<Integer> answerArr = new ArrayList<>();
		for (int i = 0; i < genreOrder.size(); i++) {
			String curGenre = genreOrder.get(i);
			List<Music> music = new ArrayList<>();
			for (int j = 0; j < arrLen; j++) {
				if (genres[j].equals(curGenre)) {
					music.add(new Music(curGenre, plays[j], j));
				}
			}
			Collections.sort(music, new Comparator<Music>() {
				@Override
				public int compare(Music o1, Music o2) {
					return o2.plays - o1.plays;
				}
			});

			answerArr.add(music.get(0).idx);
			if (music.size() > 1)
				answerArr.add(music.get(1).idx);
		}

		int[] answer = new int[answerArr.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerArr.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(
			new String[] {"classic", "pop", "classic", "classic", "pop"},
			new int[] {500, 600, 150, 800, 2500}
		)));
	}
}