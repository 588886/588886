class Solution {
    public int solution(String A, String B) {
        int cnt=1;
        if(A.equals(B)) return 0;
        while(true){
			
			A=A.substring(A.length()-1)+A.substring(0,A.length()-1);
			if(A.equals(B)){
				return cnt;
			}else if(cnt>A.length()) {
				return -1;
			}
			cnt++;
		}
    }
}