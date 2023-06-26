import java.util.*;
class Palindrom{
	public static boolean showpal(String str,int n){
		//int n=str.length();
		int c=0;
		for(int i=0;i<n/2;i++){
			if(str.charAt(i)!=str.charAt(n-1-i))
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:: ");
		String word=sc.next();
		int n=word.length();
		//int r=showpal(word,n);
		System.out.println(showpal(word,n));
	}
}