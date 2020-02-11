import java.math.BigInteger;
import java.util.function.BiFunction;

public class MettleAddition {
	
	public static String stringSum(String x, String y) {
		
		BigInteger n1 = new BigInteger(x);
		BigInteger n2 = new BigInteger(y);
		return String.valueOf(n1.add(n2));
		
		
		/*if(x.length() > y.length()) {
			String t = x;
			x = y;
			y = t;
		}
		System.out.println(x+" "+y);
		int xlen = x.length(), ylen = y.length();
		int carry=0;
		String res="";
		for(int i=xlen-1; i>=0; i--) {
			int sum = ((int)x.charAt(i)-'0') + ((int)y.charAt(i+ylen-xlen)-'0')+carry;
			res+=(char)(sum%10+'0');
			carry = sum/10;
		}
		for(int i=ylen-xlen-1; i>=0; i--) {
			int sum = ((int)y.charAt(i)-'0')+carry;
			res+=(char)(sum%10+'0');
			carry = sum/10;
		}
		if(carry>0)
			res+=(char)(carry+'0');
		
		return new StringBuilder(res).reverse().toString();*/
	}
	
	public static String addString(String x, String y) {
		int xlen = x.length(), ylen = y.length();
		if(xlen > ylen) {
			y = appendZero(xlen-ylen)+y;
		}
		else {
			x = appendZero(ylen-xlen)+x;
		}
		
		int carry=0, sum=0;
		String res="";
		for(int i=x.length()-1; i>=0; i--) {
			sum = ((int)x.charAt(i)-'0') + ((int)y.charAt(i)-'0')+carry;
			res = (sum%10)+res;
			carry = sum/10;
		}
		
		if(carry > 0)
			res = carry + res;
		return res;
		
		
	}
	
	public static String appendZero(int x) {
		String str="";
		for(int i=0; i<x; i++)
			str+="0";
		return str;
	}
	
	public static int addCyclic(int x) {
		int sum=0;
		String str = String.valueOf(x),res="";
		for(int i=0; i<str.length(); i++){
			res = str.substring(i,str.length());
			for(int j=0; j<res.length(); j++){
				sum = sum + ((int)res.charAt(j)-'0');
			}
		}
		return sum;	
	}
	
	
	public static void main(String []args) {
		String x = "12345673218989543219";
		String y =      "987612673489652";
		//          12346660831663032871
		System.out.println(stringSum(x, y));
		System.out.println(addString(x, y));
	
	}
	
}

