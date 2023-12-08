import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = sides[2]>=sides[1]+sides[0] ? 2:1;
        return answer;
    }
}