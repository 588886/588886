
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.equals(" ")) System.out.println(0);
        else System.out.println((str.charAt(0)+"").equals(" ") ?  str.split(" ").length-1:str.split(" ").length);

        sc.close();

    }

}

