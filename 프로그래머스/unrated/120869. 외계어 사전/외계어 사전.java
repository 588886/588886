class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer=2;
		for(String str:dic) {
            int cnt=0;
			for(String st:spell) {
				if(str.contains(st)&&str.indexOf(st)==str.lastIndexOf(st))
					cnt++;
			}
			if(cnt==spell.length)answer=1;
		}
		
        return answer;
    }
}