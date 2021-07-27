package javaPractice;

public class Capitalizeword {

	public static void main(String[] args) {
		String str="hi i am mangesh";
		
		String[] sp=str.split("\\s");
			
		for(String sk:sp) {
			System.out.print(sk.toUpperCase().charAt(0)+sk.substring(1)+" ");
		}
		
		
		StringBuffer sj=new StringBuffer("Hey");
		String s=sj.toString();
		
		System.out.println(s);
		
		System.out.println(s.concat("Bn"));
		System.out.println(s.concat("Bn"));
		System.out.println(s.concat("Bn"));
		

	}

}
