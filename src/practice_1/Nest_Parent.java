package practice_1;
// parent class
public class Nest_Parent {

	//parent class method
	
	String name="liga";
	
	public static void main(String[] args) {
		
		Childclass ob1=new Childclass();
		
		System.out.println(Childclass.salary);
		Nest_Parent ob2=new Nest_Parent();
		
		
		System.out.println(ob2.name);
		
		
	}
	//child class
	public static class Childclass{
	// child class main method	
		  int age=34;
		  static double salary=34.78;
		
		
		public static void main(String[] args) {
			Childclass ob=new Childclass();
			
			System.out.println(ob.age);
			
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
