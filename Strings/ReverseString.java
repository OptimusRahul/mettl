public class ReverseString {

	public static void main(String []args) {
		String str = "Hello World!! This is Rahul";
		String data[] = str.split(" ");
		String temp="";
		
		for(int i=data[1].length()-1; i>=0; i--) {
			temp+=data[1].charAt(i);
		}
		
		data[1] = temp;
		
		for(int i=0; i<data.length; i++)
			System.out.print(data[i]+" ");
		
		System.out.println();
		for(String s : data) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		String res = reverseWord(str, 2);
		System.out.println(res);
		/*for(int i=0; i<res.length()-1; i++)
			System.out.print(res+" ");*/
	}
	
	public static String reverseWord(String str, int pos) {
		int countBlank=0;
		String temp="", result="",revWord="";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				temp += str.charAt(i);
				System.out.println(temp);
			}
			else {
				countBlank++;
				if(countBlank == pos) {
					for(int j=0; j<temp.length(); j++) {
						revWord=temp.charAt(j)+revWord;
					}
					System.out.println(revWord);
				}
			}
			result = temp+" "+revWord;
		}
		return result;
		
	}
	
	
}
