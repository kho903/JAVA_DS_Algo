package programmers.lv01.이상한_문자_만들기;

public class Solution {
	public String solution(String s) {
		char[] sChar = s.toCharArray();
		int sIndex = 1;
		for (int i = 0; i < sChar.length; i++) {
			if (sChar[i] == ' ') sIndex=1;
			else {
				char a = sChar[i];
				if (sIndex % 2 == 1) sChar[i] = Character.toUpperCase(a);
				else sChar[i] = Character.toLowerCase(a);
				sIndex++;
			}
		}
		return String.valueOf(sChar);
	}
}
