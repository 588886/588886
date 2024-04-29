import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> completionMap=new HashMap<>();
		String answer="";
		for(int i=0;i<completion.length;i++) {
			if(completionMap.containsKey(completion[i])) {
				completionMap.put(completion[i], completionMap.get(completion[i])+1);
			}else {
				completionMap.put(completion[i], 1);
			}
		}
		
		for(int i=0;i<participant.length;i++) {
			if(completionMap.containsKey(participant[i])==false) {
				answer=participant[i];
				break;
			}else if(completionMap.containsKey(participant[i])) {
				if(completionMap.get(participant[i])==0) {
					answer=participant[i];
					break;
				}else {
					completionMap.put(participant[i], completionMap.get(participant[i])-1);
				}
			}
		}
        return answer;
    }
}