class Solution {
    public boolean solution(int x) {
        int y=0;
		for(int i=0;i<(x+"").length();i++) {
			y+=Integer.parseInt((x+"").charAt(i)+"");
		}
        return x%y==0 ? true:false;
    }
}