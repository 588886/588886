class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        int a=sides[0]>sides[1] ? sides[0]:sides[1];
        int b=!(sides[0]>sides[1]) ? sides[0]:sides[1];
        for(int i=1;i<=2000;i++){
            if(i<a+b&&a<i)answer++;
            if(a<i+b&&a>i)answer++;
        }
        return answer;
    }
}