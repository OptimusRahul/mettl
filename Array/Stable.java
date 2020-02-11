public class Stable {
	
	public int findPassword(int a,int b, int c, int d, int e) {
	int arr[] = {a,b,c,d,e};
	int stableSum=0, unstableSum=0;
	for(int i=0; i<arr.length; i++){
		if(isStable(arr[i]))
			stableSum+=arr[i];
		else
			unstableSum+=arr[i];
	}
	int password = stableSum-unstableSum;
	return password;
}

public boolean isStable(int num){
	int arr[] = {0,0,0,0,0,0,0,0,0,0};
	int n=num;
	int nonZeroCount=0,c=0;
	while(n > 0){
		int temp = n%10;
		arr[temp]++;
		n/=10;
		if(arr[temp]!=0) c++;
	}
	for(int i=0; i<arr.length; i++)
		if(arr[i]!=0) nonZeroCount++;

	int stableArr[] = new int[nonZeroCount];
	int index=0;
	for(int i=0; i<arr.length; i++){
		if(arr[i] != 0)
			stableArr[index++]=arr[i];
	}
	int temp = stableArr[0];
	boolean flag=false;
	for(int i=0; i<stableArr.length; i++){
		if(temp == stableArr[i])
			flag = true;
		else{
			flag =false;
			return flag;
		}
	}
	return true;
}

}
