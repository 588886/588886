
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=0;
        for(int i=0;i<num;i++){
            String str=sc.next();
            boolean relay=true;
            for(int j=0;j<str.length()-1;j++){
                if(str.indexOf(str.charAt(j))!=str.lastIndexOf(str.charAt(j))){
                    for(int k=j;k<str.lastIndexOf(str.charAt(j))-1;k++){
                        if(str.charAt(k)!=str.charAt(k+1)){
                            relay=false;
                            break;
                        }
                    }
                }
                if(relay==false)break;
            }
            if(relay){
                result++;
            }

            
        }
        System.out.println(result);
        sc.close();
    }
}