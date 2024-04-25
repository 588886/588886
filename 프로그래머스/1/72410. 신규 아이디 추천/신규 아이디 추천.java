class Solution {
    public String solution(String new_id) {
        //1단계
		new_id=new_id.toLowerCase();
		
		//2단계
		String idLv2="";
		for(int i=0;i<new_id.length();i++) {
			if((new_id.charAt(i)>=97&&new_id.charAt(i)<=122)||
			   (new_id.charAt(i)>=48&&new_id.charAt(i)<=57) ||
				new_id.charAt(i)==45 || new_id.charAt(i)==95|| 
				new_id.charAt(i)==46) {
				idLv2+=new_id.charAt(i)+"";
			}
		}
		
		//3단계
		String idLv3="";
		idLv3+=idLv2.charAt(0)+"";
		for(int i=1;i<idLv2.length();i++) {
			if(!(idLv3.charAt(idLv3.length()-1)==46&&idLv2.charAt(i)==46)) {
				idLv3+=idLv2.charAt(i);
			}
		}
		
		//4단계
		String idLv4=idLv3;
		for(int i=0;i<idLv3.length();i++) {
			if(idLv4.charAt(0)==46)idLv4=idLv4.replaceFirst(".", "");
			if(idLv4.length()>1) {
				if(idLv4.charAt(idLv4.length()-1)==46)idLv4=idLv4.substring(0, idLv4.length()-1);
			}else if(idLv4.length()>1&&idLv4.length()==1)idLv4="";
		}
		
		//5단계
		if(idLv4.length()==0)idLv4="a";
		
		//6단계
		String idLv6=idLv4;
		if(idLv4.length()>=16) {
			idLv6=idLv4.substring(0, 15);
		}
		for(int i=0;i<idLv4.length();i++) {
			if(idLv6.charAt(idLv6.length()-1)==46)idLv6=idLv6.substring(0, idLv6.length()-1);
		}
		
		//7단계
		while(idLv6.length()<=2) {
			idLv6+=idLv6.charAt(idLv6.length()-1);
		}
        return idLv6;
    }
}