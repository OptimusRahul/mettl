import java.util.HashMap;
import java.util.Map.Entry;


public class PalindromePossible {
	
	public static int ppString(int input1) {
		String str = String.valueOf(input1);
		StringBuffer sb = new StringBuffer(str);
		String rev = sb.reverse().toString();
		if(str.equals(rev))
			return -1;
		else{
			return isPalindrome(str);
		}
	}

	public static int isPalindrome(String str){
		int n=-1;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++){
			if(!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i),0);
			}
			else {
				hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
			} 
		}
		for(Entry<Character, Integer> entry: hm.entrySet()) {
			if(entry.getValue().equals(0)) {
				n = entry.getKey()-'0';
			}
		}
		return n;			
	}
	
	public static void main(String []args) {
		System.out.println(ppString(981894));
		
	}
}
