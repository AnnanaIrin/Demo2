package practice_1;

public class Obj_2 {

	
	String name="Irin"; //everything is global variable
	int age=45;
	static double salary=3498.76;
	
	
	public static void main(String args[]) {
		
//		object is a instance of a class
		
		int id =205; //local variable
		
		System.out.println(id);
		
		Obj_2 topic=new Obj_2();
		
		System.out.println(topic.age);
		
		System.out.println(topic.name);
		
		System.out.println(Obj_2.salary);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
