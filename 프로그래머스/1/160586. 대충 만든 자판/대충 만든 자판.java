class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer=new int[targets.length];
		for(int i=0;i<targets.length;i++) {
			for(int j=0;j<targets[i].length();j++) {
				int min=-1;
				for(int k=0;k<keymap.length;k++) {
					if(keymap[k].indexOf(targets[i].charAt(j))>=0) {
						if(min==-1) {
							min=keymap[k].indexOf(targets[i].charAt(j));
						}else {
							min=min>keymap[k].indexOf(targets[i].charAt(j)) ? keymap[k].indexOf(targets[i].charAt(j)):min;
						}
					}
				}
				if(min==-1) {
					answer[i]=-1;
					break;
				}
				answer[i]+=min+1;
			}
		}
        return answer;
    }
}