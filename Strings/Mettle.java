import java.util.Scanner;

public class Mettle {
	
	public static String getDiff(String str) {
		int diff=0; 
		char ch_i = 0, ch_j;
		int len = getLength(str);
		for(int i=0, j=str.length()-1; i<len; i++, j--) {
			if(i != j) {
				ch_i = str.charAt(i);
				ch_j = str.charAt(j);
				diff = diff + Math.abs(((int)ch_i-(int)ch_j));
			}
			else if(i==j) {
				ch_i=str.charAt(i);
				diff += ((int)ch_i-65+1);
				break;
			}
		}
		return String.valueOf(diff) ;
	}
	
	public static int getLength(String str) {
		return (str.length()%2==0? str.length()/2:(str.length()/2)+1);
	}
	
	public static String getConcat(String []str) {
		String res="";
		for(String s:str)
			res+=s;
		return res;
	}
	
	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter String : ");
		//String str = sc.nextLine();
		String str = "World Wide Web";
		System.out.print("Result:");
		str = str.toUpperCase();
		String arr[] = str.split(" ");
		String res[] = new String[arr.length];
		//String result[] = new String[arr.length];
		for(int i=0; i<arr.length; i++) {
			res[i] = getDiff(arr[i]);
			//result[i] = getChar(arr[i]);
		}
		System.out.println(getConcat(res));
		sc.close();
	}
}
