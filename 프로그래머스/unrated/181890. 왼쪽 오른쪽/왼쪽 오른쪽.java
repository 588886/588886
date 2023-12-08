class Solution {
    public String[] solution(String[] str_list) {
        int mode = 0;
		int idx =0;
		for(int i= 0;i<str_list.length;i++) {
			
			if(str_list[i].equals("l")) {
				mode = -1;
				idx=i;
				break;
			}else if(str_list[i].equals("r")) {
				mode = 1;
				idx=i;
				break;
			}
			
		}
		String[] answer = null;
		if(mode==0) {
			answer = new String[0];
		}else if(mode==-1) {
			answer = new String[idx];
			for(int i = 0;i<idx;i++) {
				answer[i]=str_list[i];
			}
		}else if(mode==1) {
			answer = new String[str_list.length-idx-1];
			for(int i = 0;i<answer.length;i++) {
				answer[i]=str_list[i+idx+1];
			}
		}
        return answer;
    }
}