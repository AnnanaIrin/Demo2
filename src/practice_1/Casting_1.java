package practice_1;

public class Casting_1 {

	
	public static void main(String args[]) {
		
		int age=30;
		double weight=50;
		float pizzaPrice=14.50f;
		long monthlySale=10000l;
		short salary=1200;
		byte number=126;
//		boolean chickenFry= true;
//		char pizzaSize='L';
		String name="Irin";
		
		 System.out.println(age);
		 
		 
		double weight1=(double)age;//int to double
		System.out.println(weight);
		
		int age1=(int)weight;
		System.out.println(age);//double to int
		
		float pizzaPrice1=(float)weight; // float to double
		System.out.println(pizzaPrice);
		
		byte number1 =(byte)pizzaPrice; //float to byte
		System.out.println(number);
		
		long month=(long)salary;   //short to long
		System.out.println(monthlySale);
		
		short salary1=(short)monthlySale; //long to short
		System.out.println(salary);
		
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
