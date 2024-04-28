import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] student1= {1, 2, 3, 4, 5};
		int[] student2= {2, 1, 2, 3, 2, 4, 2, 5};
		int[] student3= {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int count1=0;
		int count2=0;
		int count3=0;
		
		int index1=0;
		int index2=0;
		int index3=0;
		
		for(int num : answers) {
			if(student1[index1]==num) count1++;
			if(student2[index2]==num) count2++;
			if(student3[index3]==num) count3++;
			if(index1<student1.length-1) {
				index1++;
			}else if(index1==student1.length-1){
				index1=0;
			}
			if(index2<student2.length-1) {
				index2++;
			}else if(index2==student2.length-1){
				index2=0;
			}
			if(index3<student3.length-1) {
				index3++;
			}else if(index3==student3.length-1){
				index3=0;
			}
		}
		
		ArrayList<Integer> answer=new ArrayList<>();
		
		if(count1==count2&&count1==count3) {
			answer.add(1);
			answer.add(2);
			answer.add(3);
		}else if(count1>count2&&count1>count3) {
			answer.add(1);
		}else if(count2>count1&&count2>count3) {
			answer.add(2);
		}else if(count3>count1&&count3>count2) {
			answer.add(3);
		}else if(count1==count2&&count2>count3) {
			answer.add(1);
			answer.add(2);
		}else if(count1==count3&&count1>count2) {
			answer.add(1);
			answer.add(3);
		}else if(count2==count3&&count2>count1) {
			answer.add(2);
			answer.add(3);
		}
        answer.sort((o1, o2) -> o1-o2);
        return answer;
    }
}