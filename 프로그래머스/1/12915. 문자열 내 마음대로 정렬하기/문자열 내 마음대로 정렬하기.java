import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return  Character.compare(o1.charAt(n), o2.charAt(n));
			}
		});
		int indexMin=0;
		int indexMax=strings.length-1;
		
		for(int i=1;i<strings.length;i++) {
			if(strings[i].charAt(n)!=strings[i-1].charAt(n)) {
				indexMax=i;
				Arrays.sort(strings, indexMin, indexMax);
				indexMin=indexMax;
			}else if(strings[i].charAt(n)==strings[i-1].charAt(n)&&i==strings.length-1) {
				indexMax=i;
				Arrays.sort(strings, indexMin, indexMax+1);
			}
		}
        return strings;
    }
}