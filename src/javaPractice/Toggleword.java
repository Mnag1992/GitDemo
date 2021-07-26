package javaPractice;

public class Toggleword {

	public static void main(String[] args) {
		
		String str="this is my house";
		
		String[] sk=str.split("\\s");
		
		for(String sp:sk) {
			System.out.print(sp.charAt(0)+sp.toUpperCase().substring(1)+" ");
		}
		
		

	}

}
