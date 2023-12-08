class Solution {
    public String solution(String rny_string) {
        char[] str = rny_string.toCharArray();
		String answer = "";
		for(char c: str) {
			answer= (c+"").equals("m") ? answer+"rn":answer+c+"";
		}
        return answer;
    }
}