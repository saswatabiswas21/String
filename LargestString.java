import java.util.*;
class LargestString{
	public static void com(String f){
		String larg=f.charAt(0);
		for(int i=1;i<f.length();i++){
			if(larg.compareToIgnoreCase(f.charAt(i)<0))//ignore upper and lower case of same alphabate unlike compareTo();
				larg=f.charAt(i);
		}
		System.out.println("The lexicography largest froot is:: "+larg);
	}
	public static void main(String[] args){
		String froots[]={"apple","mango","bannana"};
		com(froots);
	}
}