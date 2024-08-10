
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int result=0;
        for(int i=0;i<str.length();i++){
            if(str.equals("")){
                break;
            }else if(str.indexOf("dz=")!=-1){
                str=str.replaceFirst("dz=","11");
//                str=str.replace("dz=","11");
                result++;
            }else if(str.indexOf("c=")!=-1){
                str=str.replaceFirst("c=","11");
//                str=str.replace("c=","11");
                result++;
            }else if(str.indexOf("c-")!=-1){
                str=str.replaceFirst("c-","11");
//                str=str.replace("c-","11");
                result++;
            }else if(str.indexOf("d-")!=-1){
                str=str.replaceFirst("d-","11");
//                str=str.replace("d-=","11");
                result++;
            }else if(str.indexOf("lj")!=-1){
                str=str.replaceFirst("lj","11");
//                str=str.replace("lj","11");
                result++;
            }else if(str.indexOf("nj")!=-1){
                str=str.replaceFirst("nj","11");
//                str=str.replace("nj","11");
                result++;
            }else if(str.indexOf("s=") != -1){
                str=str.replaceFirst("s=","11");
//                str=str.replace("s=","11");
                result++;
            }else if(str.indexOf("z=")!=-1){
                str=str.replaceFirst("z=","11");
//                str=str.replace("z=","11");
                result++;
            }else{
                break;
            }
        }
        str=str.replaceAll("11","");
        result+=str.length();
        System.out.println(result);
        sc.close();
    }
}