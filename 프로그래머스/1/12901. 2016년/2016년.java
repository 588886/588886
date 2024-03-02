import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Solution {
    public String solution(int a, int b) {
        String date="2016-"+a+"-"+b;
		DateTimeFormatter date1=DateTimeFormatter.ofPattern("yyyy-M-d");
		LocalDate date2=LocalDate.parse(date,date1);
		String answer="";
		for(int i=0;i<3;i++) {
			answer+=date2.getDayOfWeek().toString().charAt(i);
		}   
        return answer;
    }
}