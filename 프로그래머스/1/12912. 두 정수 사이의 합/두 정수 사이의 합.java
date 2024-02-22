class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b)return a;
        for(long i=a>b ? b:a;i<= (a>b ? a:b);i++){
            answer+=i;
        }
        return answer;
    }
}