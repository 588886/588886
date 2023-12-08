
import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<picture.length;i++) {
			
			String ss="";
			for(int i1=0;i1<picture[i].length();i1++) {
				
				for(int i2=0;i2<k;i2++) {
					
					ss+=picture[i].charAt(i1);
				}
				
			}
			for(int i3=0;i3<k;i3++) {
				
				list.add(ss);
			}
		}
        return list;
    }
}