//StringBuilder
class Build{
	public static void main(String[] args){
		StringBuilder sb=new StringBuilder("");
		for(char i='a';i<='z';i++)
			sb.append(i);
		System.out.println("After append in string bulder:: "+sb);
		System.out.println("Size of String builder object:: "+sb.length());
		System.out.println("After convert into string:: "+sb.toString());
	}
}