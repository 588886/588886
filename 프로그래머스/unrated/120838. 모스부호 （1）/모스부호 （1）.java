class Solution {
    public String solution(String letter) {
        String[] str=letter.split(" ");
		String answer="";
		for(String s:str) {
			
			if(s.equals(".-")) {
				answer+="a";
			}else if(s.equals("-...")) {
				answer+="b";
			}else if(s.equals("-.-.")) {
				answer+="c";
			}else if(s.equals("-..")) {
				answer+="d";
			}else if(s.equals(".")) {
				answer+="e";
			}else if(s.equals("..-.")) {
				answer+="f";
			}else if(s.equals("--.")) {
				answer+="g";
			}else if(s.equals("....")) {
				answer+="h";
			}else if(s.equals("..")) {
				answer+="i";
			}else if(s.equals(".---")) {
				answer+="j";
			}else if(s.equals("-.-")) {
				answer+="k";
			}else if(s.equals(".-..")) {
				answer+="l";
			}else if(s.equals("--")) {
				answer+="m";
			}else if(s.equals("-.")) {
				answer+="n";
			}else if(s.equals("---")) {
				answer+="o";
			}else if(s.equals(".--.")) {
				answer+="p";
			}else if(s.equals("--.-")) {
				answer+="q";
			}else if(s.equals(".-.")) {
				answer+="r";
			}else if(s.equals("...")) {
				answer+="s";
			}else if(s.equals("-")) {
				answer+="t";
			}else if(s.equals("..-")) {
				answer+="u";
			}else if(s.equals("...-")) {
				answer+="v";
			}else if(s.equals(".--")) {
				answer+="w";
			}else if(s.equals("-..-")) {
				answer+="x";
			}else if(s.equals("-.--")) {
				answer+="y";
			}else if(s.equals("--..")) {
				answer+="z";
			}
			
			
			
		}
        return answer;
    }
}