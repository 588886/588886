
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int roll = sc.nextInt();

        for(int i=0;i<roll;i++){
            int an=sc.nextInt();
            String[] strs=sc.next().split("");
            String result="";
            for(int j=0;j<strs.length;j++){
                for(int k=0;k<an;k++){
                    result+=strs[j];
                }
            }
            System.out.println(result);
        }

        sc.close();

    }

}

