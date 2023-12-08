import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b="";
        for(char cg : a.toCharArray()) {
			if(((int)cg>=64)&&((int)cg<=90)) {
				b+=(char)((int)cg+32);
			}else if(((int)cg>=97)&&((int)cg<=122)){
				b+=(char)((int)cg-32);
			}
		}
        
		System.out.println(b);
    }
}