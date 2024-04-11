package fruitsOOP;

public class Main {

	public static void main(String[] args) {
		
		// inheritance = 	the process where one class acquires,
		//					the attributes and methods of another.
		//https://www.youtube.com/watch?v=Zs342ePFvRI
		
		Apple apple = new Apple();
		
		Pear pear = new Pear();
		
		apple.eat();
		pear.eat();
		
		System.out.println(pear.colour);
		System.out.println(apple.colour);
		System.out.println(pear.purchase); //prints null as it is not defined
		System.out.println(apple.purchase);
				
	}
}