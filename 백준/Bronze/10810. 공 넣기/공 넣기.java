import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] list=new int[n];
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			for(int i1=a; i1<b+1;i1++) {
				list[i1-1]=c;
			}
		}
		sc.close();
		for(int x:list) {
			
			System.out.print(x);
			System.out.print(' ');
		}

	}
}