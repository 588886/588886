import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double totalScore=0.0;
        Double totalCredit=0.0;
        for(int i=0;i<20;i++){
            String str=sc.nextLine();
            if(str.charAt(str.length()-1)!=80){
                String[] strs=str.split(" ");
                if(strs[2].equals("A+")){
                    totalScore+=Double.valueOf(strs[1])*4.5;
                    totalCredit+=Double.valueOf(strs[1]);
                } else if (strs[2].equals("A0")) {
                    totalScore+=Double.valueOf(strs[1])*4.0;
                    totalCredit+=Double.valueOf(strs[1]);
                } else if (strs[2].equals("B+")) {
                    totalScore+=Double.valueOf(strs[1])*3.5;
                    totalCredit+=Double.valueOf(strs[1]);
                } else if (strs[2].equals("B0")) {
                    totalScore+=Double.valueOf(strs[1])*3.0;
                    totalCredit+=Double.valueOf(strs[1]);
                } else if (strs[2].equals("C+")) {
                    totalScore+=Double.valueOf(strs[1])*2.5;
                    totalCredit+=Double.valueOf(strs[1]);
                } else if (strs[2].equals("C0")) {
                    totalScore+=Double.valueOf(strs[1])*2.0;
                    totalCredit+=Double.valueOf(strs[1]);
                } else if (strs[2].equals("D+")) {
                    totalScore+=Double.valueOf(strs[1])*1.5;
                    totalCredit+=Double.valueOf(strs[1]);
                } else if (strs[2].equals("D0")) {
                    totalScore+=Double.valueOf(strs[1])*1.0;
                    totalCredit+=Double.valueOf(strs[1]);
                } else if (strs[2].equals("F")) {
                    totalCredit+=Double.valueOf(strs[1]);
                }
            }

        }

        System.out.println(totalScore/totalCredit);
        sc.close();
    }
}

