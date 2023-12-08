import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=num1;i<=num2;i++){
            answer.add(numbers[i]);
        }
        return answer;
    }
}