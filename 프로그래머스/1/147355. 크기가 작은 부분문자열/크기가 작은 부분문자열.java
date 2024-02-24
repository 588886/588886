class Solution {
    public long solution(String t, String p) {
		long count=0;
		for(int i=0;i<t.length()-p.length()+1;i++) {
			String str=t.substring(i,p.length()+i);
			if(Long.parseLong(str)<=Long.parseLong(p))count++;
		}
        return count;
    }
}