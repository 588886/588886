class Solution {
    public int solution(String my_string) {
        String str="";
		char[] ch=my_string.toCharArray();
		for(char c:ch) {
			if(c>64) {
				str+="a";
			}else {
				str+=c+"";
			}
		}
		String[] str1=str.split("a");
		int answer=0;
		for(String s:str1) {
			if(!s.equals("")) {
				answer+=Integer.parseInt(s);
			}
		}
        return answer;
    }
}