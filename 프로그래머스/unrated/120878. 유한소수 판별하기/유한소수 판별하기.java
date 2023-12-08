class Solution {
    public int solution(int a, int b) {
        
        return (((double)a/(double)b)+"").substring((((double)a/(double)b)+"").indexOf(".")+1).length()>10 ? 2:1;
    }
}