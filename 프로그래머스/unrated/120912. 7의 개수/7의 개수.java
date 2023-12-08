class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i:array){
            answer+=count7(i);
        }
        return answer;
    }
    
    int count7(int i){
        int count=0;
        String[] s=(i+"9").split("");
        for(String a:s){
            if(a.equals("7")) count++;
        }
        return count;
    }
}