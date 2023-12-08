class Solution {
    public int solution(int num, int k) {
        int answer = (num+"").indexOf(k+"")==-1 ? -1:(num+"").indexOf(k+"")+1;
        return answer;
    }
}