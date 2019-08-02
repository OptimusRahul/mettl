import java.util.Scanner;

public class SubStrEO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		while(T>=1 && T<=10) {
			String str = sc.nextLine();
			if(str.length() > 1 && str.length() <= 10000) {
				display(evenOddPart(str).split(" "));
			}
			else {
				System.exit(0);
			}
			T--;
		}
		sc.close();
	}
	
	public static void display(String str[]) {
		for(String s: str)
			System.out.print(s+"\t");
		System.out.println();
	}
	
	public static String evenOddPart(String str) {
		String evenStr="", oddStr="";
		String res="";
		for(int i=0; i<str.length(); i++) {
			if(i%2 == 0) {
				evenStr+=str.charAt(i);
			}
			else {
				oddStr+=str.charAt(i);
			}
		}
		res = evenStr+" "+oddStr;
		return res;
	}

}
