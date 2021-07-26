package javaPractice;

public class Stringreverse {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("Hi I am Mangesh");
		System.out.println(sb.reverse());
		
		StringBuilder sf= new StringBuilder("Hi I am Mangesh");
		System.out.println(sf.reverse());
		
		System.out.println((new StringBuffer("Hi I am Mangesh")).reverse());
		
		String str="Hi I am Mangesh";
		
		int l=str.length();
		
		char[] ch=str.toCharArray();
		
		for(int i=l-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		
		System.out.println("");
		
		for(int i=l-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
		

	}

}
