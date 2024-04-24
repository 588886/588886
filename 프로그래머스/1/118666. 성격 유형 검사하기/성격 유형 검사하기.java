import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] type= {"R","T","C","F","J","M","A","N"};
		HashMap<String, Integer> result=new HashMap<>();
		
		for(int i=0;i<type.length;i++) {
			result.put(type[i], 0);
		}
		
		for(int i=0;i<survey.length;i++) {
			
			if(survey[i].equals("RT")){
				result.put("R", result.get("R")+4-choices[i]);
			}else if(survey[i].equals("TR")) {
				result.put("T", result.get("T")+4-choices[i]);
			}else if(survey[i].equals("CF")) {
				result.put("C", result.get("C")+4-choices[i]);
			}else if(survey[i].equals("FC")) {
				result.put("F", result.get("F")+4-choices[i]);
			}else if(survey[i].equals("JM")) {
				result.put("J", result.get("J")+4-choices[i]);
			}else if(survey[i].equals("MJ")) {
				result.put("M", result.get("M")+4-choices[i]);
			}else if(survey[i].equals("AN")) {
				result.put("A", result.get("A")+4-choices[i]);
			}else if(survey[i].equals("NA")) {
				result.put("N", result.get("N")+4-choices[i]);
			}
			
		}
		
		String answer=(result.get("R") >= result.get("T") ? "R" : "T") + 
					  (result.get("C") >= result.get("F") ? "C" : "F") + 
					  (result.get("J") >= result.get("M") ? "J" : "M") +
					  (result.get("A") >= result.get("N") ? "A" : "N") ;
        return answer;
    }
}