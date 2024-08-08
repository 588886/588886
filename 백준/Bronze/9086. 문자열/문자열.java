import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int M=sc.nextInt();
        for(int i=0;i<M;i++){
            String str=sc.next();
            if(str.length()==1){
                System.out.println(str+str);
            }else{
               System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
            }
        }


        sc.close();

    }

}

