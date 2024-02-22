import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer=0;
		String[] numList= (n+"").split(""); 
		for(int i=0;i<numList.length;i++) {
			answer+=Integer.valueOf(numList[i]);
		}

        return answer;
    }
}