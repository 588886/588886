class Solution {
    public int solution(int n) {
        int p=0;
		
		for(int i=1;i<=n;i++) {
			p++;
			while((p%3==0)||(p+"").contains("3")) {
				p++;
			}
			
		}
		while((p%3==0)||(p+"").contains("3")) {
			p++;
		}
        return p;
    }
}