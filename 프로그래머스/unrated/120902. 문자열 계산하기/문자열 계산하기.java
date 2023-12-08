class Solution {
    public int solution(String my_string) {
        String[] st=my_string.split(" ");
		int mode=0;
		int answer=0;
		for(String str:st) {
			if(mode==0) {
				if(str.equals("+")) mode=1;
				else if(str.equals("-")) mode=2;
				else answer+=Integer.parseInt(str);
			}else if(mode==1) {
				if(str.equals("-")) mode=2;
				else if(!str.equals("+"))answer+=Integer.parseInt(str);
			}else if(mode==2) {
				if(str.equals("+")) mode=1;
				else if(!str.equals("-"))answer-=Integer.parseInt(str);
			}
		}
        return answer;
    }
}