
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int time=0;
        for(int i=0;i<str.length();i++){
            if(65<=str.charAt(i)&&str.charAt(i)<=67){
                time+=3;
            }else if(68<=str.charAt(i)&&str.charAt(i)<=70){
                time+=4;
            }else if(71<=str.charAt(i)&&str.charAt(i)<=73){
                time+=5;
            }else if(74<=str.charAt(i)&&str.charAt(i)<=76){
                time+=6;
            }else if(77<=str.charAt(i)&&str.charAt(i)<=79){
                time+=7;
            }else if(80<=str.charAt(i)&&str.charAt(i)<=83){
                time+=8;
            }else if(84<=str.charAt(i)&&str.charAt(i)<=86){
                time+=9;
            }else if(87<=str.charAt(i)&&str.charAt(i)<=90){
                time+=10;
            }
        }
        System.out.println(time);

        sc.close();

    }
}

