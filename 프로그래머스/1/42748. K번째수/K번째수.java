import java.util.ArrayList;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer=new int[commands.length];
		for(int i=0;i<commands.length;i++) {
			ArrayList<Integer> numList=new ArrayList<>();
			for(int j=commands[i][0]-1;j<commands[i][1];j++) {
				numList.add(array[j]);
			}
			numList.sort((o1, o2) -> o1-o2);
			answer[i]=numList.get(commands[i][2]-1);
		}
        return answer;
    }
}