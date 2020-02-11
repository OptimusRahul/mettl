public class Pattern {
	
	public static void main(String []args) {
		int n=10,sum=0, a=5, c=2;
		boolean flag=false;
		for(int i=0; i<2*a; i=i+2) {
			for(int j=0; j<=i; j++) {
				if(flag == true) {
					if(j%2==0)
						n+=c;
					else
						n-=c;
				}
				sum+=n;
				System.out.print(n+" ");
			}
			flag=true;
			System.out.println();
		}
		
		System.out.println(sum);
	}
}



/*
 * 10=10
 * 12+10+12=34
 * 14+12+14+12+14=66
 * 16+14+16+14+16+14+16=106
 * 18+16+18+16+18+16+18+16+18+16+18=154
 * 
 * */
