package javaPractice;

public class Reversewordinstring {

	public static void main(String[] args) {
		
		String str="This is my house";
		
		String[] sa=str.split("\\s");
		
		//for(String sf:sa) {
		//	StringBuffer sb=new StringBuffer(sf);
		//	System.out.print(sb.reverse()+" ");
		//}
		
		for(String sf:sa) {
			
			for(int i=sf.length()-1;i>=0;i--) {
				System.out.print(sf.charAt(i));
			}
			System.out.print(" ");
		}

	}

}
