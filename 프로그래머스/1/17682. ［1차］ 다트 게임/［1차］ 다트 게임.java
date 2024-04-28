import java.util.ArrayList;
class Solution {
    public int solution(String dartResult) {
        String score="";
		ArrayList<String> dartList=new ArrayList<>();
		for(int i=0;i<dartResult.length();i++) {
			if(dartResult.charAt(i)>=48&&dartResult.charAt(i)<=57) {
				score+=dartResult.charAt(i)+"";
			}else if(dartResult.charAt(i)==83) {
				dartList.add(score);
				score="";
			}else if(dartResult.charAt(i)==68) {
				dartList.add((int)Math.pow(Integer.parseInt(score), 2)+"");
				score="";
			}else if(dartResult.charAt(i)==84) {
				dartList.add((int)Math.pow(Integer.parseInt(score), 3)+"");
				score="";
			}else {
				dartList.add(dartResult.charAt(i)+"");
			}
		}
		
		int answer=0;
		int backNum=-1;
		int thisNum=-1;
		for(int i=0;i<dartList.size();i++) {
			if(!dartList.get(i).equals("*")&&!dartList.get(i).equals("#")) {
				answer+=Integer.parseInt(dartList.get(i));
				backNum=thisNum;
				thisNum=Integer.parseInt(dartList.get(i));
			}else if(dartList.get(i).equals("*")){
				if(i==1){
					answer+=thisNum;
				}else if(dartList.get(i-2).equals("*")){
					answer=answer+thisNum+(backNum*2);
				}else if(dartList.get(i-2).equals("#")){
					answer=answer-(backNum)+thisNum;
				}else {
					answer+=thisNum+backNum;
				}
			}else if(dartList.get(i).equals("#")){
				answer-=thisNum*2;
			}
		}
        return answer;
    }
}