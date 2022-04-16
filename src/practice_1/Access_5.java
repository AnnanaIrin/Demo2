package practice_1;

public class Access_5 {

	int age= 35; //outside of method is call global variable
	static double salary=2000;
	String name="Aryan";
	
	
	
   public static void main(String[] args) {
	   
	   float x=23f;//Inside of method is local variable
	   
	   System.out.println(x);
	   
	   
	   Access_5 obj= new Access_5();// object is a instance of class
	   
	   System.out.println(obj.age);
	   
	   System.out.println(Access_5.salary);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
