class Solution {
    public int solution(String s) {
        String[] st=s.split(" ");
		int result = 0;
		for(int i=0;i<st.length;i++) {
			if(st[i].equals("Z")) result-=Integer.parseInt(st[i-1]) ;
			else result+=Integer.parseInt(st[i]) ;
		}
        return result;
    }
}