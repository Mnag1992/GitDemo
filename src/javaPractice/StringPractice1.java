package javaPractice;

public class StringPractice1 {

	public static void main(String[] args) {
		String s= new String("Hi");
		String s1="Hi";
	    String s2="Hi";
	    
	    System.out.println(s1==s2);
	    System.out.println(s1.equals(s2));
	    
	    System.out.println(s1);
		String sg=s1.intern();
		//System.out.println(s1==sg);
		
		String s3="Hi";
		String str1="India is a great country";
		String str2="IndiA is a Great country";
		
		String hs=str1.replace(" ","");
		
		//System.out.println(hs);
		
		char[] ch=str1.toCharArray();
		
		for(char chr:ch ) {
			//System.out.print(chr+" ");
		}
		
		//String[] str4=str1.split("\\s",3);
		String[] str4=str1.split("a",2);
		
		//System.out.println(str1.indexOf("r"));
		
		for(String str5:str4) {
			//System.out.println(str5);
		}
		
		
		
		//System.out.println(str1.compareToIgnoreCase(str2));
		
		/*System.out.println(s+" "+s1);
		
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		s=s.concat(s1);
		
		System.out.println(s);
		
		System.out.println(s3.equals(s1));
		System.out.println(s3==s1);
		
		System.out.println(s.concat(s1));*/
		
		

	}

}
