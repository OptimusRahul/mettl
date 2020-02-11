public class Frequency {

	public static void main(String []args) {
		String str="Hello this is ghost";
		char ch[] = str.toCharArray();
		int freq[] = new int[str.length()];
		int count=0;
		for(int i=0; i<ch.length; i++) {
			count = 1;
			for(int j=i+1; j<ch.length; j++) {
				if((ch[i] == ch[j])&&ch[i]!='$') {
					count++;
					ch[j]='$';
				}
			}
			freq[i] = count;
		}
		System.out.println(freq.length);
		for(int i=0; i<freq.length; i++) {
			if(ch[i]!='$' && ch[i]!=' ') {
				System.out.println(ch[i]+"-"+freq[i]);
			}
		}
	}
	
}
