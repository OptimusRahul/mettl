public class Sum {
	
	public static int getSum(int a, int b) {
		if(b==0) return a;
		else if(a==0) return b;
		else if(b>0) {			
			return getSum(a+1, b-1);
		}
		return a;
	}
	
	public static void main(String []args) {
		System.out.println(getSum(10, 3));
	}
}
