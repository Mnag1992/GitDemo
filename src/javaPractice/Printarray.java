package javaPractice;

public class Printarray {
	
	Printarray() {
		System.out.println("Constructor is called");
	}
	
	int[] print(int b[]) {
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
		return b;
	}

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6};
		
		//for(int i=0;i<a.length;i++) {
		//	System.out.print(a[i]+" ");
		//}
		
		Printarray p= new Printarray();
		int[] c=p.print(a);
		
		for(int i=0;i<c.length;i++) {
					System.out.print(c[i]+" ");
		}
	}

}
