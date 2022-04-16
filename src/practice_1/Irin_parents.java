package practice_1;
//parent class
public class Irin_parents {
      int month=3;
//parent class method
	public static void main(String[] args) {
		Childclass ob2=new Childclass();// I called child class
		Irin_parents ob1=new Irin_parents();// just change obj
		
		System.out.println(ob1.month);
		System.out.println(Childclass.salary);
	}
	
	//child class
	
	public static class Childclass{
		
		int age=23;
		static double salary=2300;
		
	//child class method	
		
		public static void main(String[] args) {
			Childclass ob=new Childclass();
			Irin_parents ob3=new Irin_parents();// just change obj
			
			
			
			System.out.println(ob.age);
			System.out.println(Childclass.salary);
			System.out.println(ob3.month);//I called parent class
			
			
			
		}
		
		
		
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
