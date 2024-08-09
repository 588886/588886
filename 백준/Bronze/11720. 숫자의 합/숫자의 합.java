
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        String str= sc.next();
        int result=0;
        for(int i=0;i<M;i++){
            result+=str.charAt(i)-48;
        }
        System.out.println(result);
        sc.close();

    }

}

