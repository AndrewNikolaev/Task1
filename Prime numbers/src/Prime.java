import java.util.Scanner;

public class Prime {
	public static void main (String arg[]) {
		int i,j,mark;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter any integer number:");
		int num = scan.nextInt();
		
		for (i=2;i<=num;i++) {
			mark=0;
			if (num==2) {
				System.out.printf("%4d",i);	
				break;
			}
			for (j=2;j<=i && j<=num;j++) {
				if(i%j==0) {
				mark++;
				}
			}
			if(mark==1) {
				System.out.printf("%4d",i);	
			}
		}
		System.out.println("\n" + "it's all prime numbers incoming in "+num);
	}
}
