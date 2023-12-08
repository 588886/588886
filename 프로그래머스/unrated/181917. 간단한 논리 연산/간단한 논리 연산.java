class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean x12V = (!(x1==true)&&!(x2==true)) ? false:true;
    	boolean x34V = (!(x3==true)&&!(x4==true)) ? false:true;
    	boolean answer = ((x12V==true)&&(x34V==true)) ? true:false;
        return answer;
    }
}