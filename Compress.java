import java.util.*;
class Compress{
	public static String com(String str){
		StringBuilder sb=new StringBuilder("");
		Integer c;
		for(int i=0;i<str.length();i++){
			c=1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
				c++;
				i++;
			}
			sb.append(str.charAt(i));
			if(c>1)
				sb.append(c.toString());
		}
		return sb.toString();
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:: ");
		String str=sc.next();
		System.out.println("The new compressed string is:: "+com(str));
	}
}