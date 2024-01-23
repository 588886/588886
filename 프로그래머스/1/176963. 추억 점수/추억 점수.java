import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public ArrayList<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> list=new HashMap<>();
		for(int i=0;i<name.length;i++) {
			list.put(name[i], yearning[i]);
		}
		ArrayList<Integer> answer=new ArrayList<>();
//		System.out.println(list.get("radi"));
		for(String[] sum :photo ) {
			int score=0;
			for(String str : sum) {
				if(list.get(str)!=null)score+=list.get(str);
			}
			answer.add(score);
		}
        return answer;
    }
}