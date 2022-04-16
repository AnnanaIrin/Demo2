package practice_1;

public class Parent_6 {
       int month=4;
	static double salary=1200.56;
	public static void main(String args []) {
		
		Parent_6 pa=new Parent_6();
		ChildClass chi1=new ChildClass();
		
		System.out.println(pa.month);
		System.out.println(ChildClass.weight);
	}
	
	
	public static class ChildClass{
		
		int age=25;
		static double weight=67.89;
		
		
		public static void main(String[] args) {
			
			ChildClass chi=new ChildClass();
			Parent_6 pa1=new Parent_6();

			System.out.println(chi.age);
			System.out.println(pa1.month);
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
