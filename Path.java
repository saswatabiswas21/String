import java.util.*;
class Path{
	public static float cal(String p){
		int x=0,y=0;
		String p2=p.toLowerCase();
		for(int i=0;i<p2.length();i++){
			char r=p2.charAt(i);
			if(r=='n')
				y++;
			else if(r=='s')
				y--;
			else if(r=='e')
				x++;
			else
				x--;
		}
		int X2=x*x;
		int Y2=y*y;
		return (float)Math.sqrt(X2+Y2);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the path:: ");
		String p=sc.next();
		float res=cal(p);
		System.out.println("The sortest path is:: "+res);
	}
}