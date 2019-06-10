package demo_java;

public class Dog {
	String arrayDog[]; 
	String name = "Dog name";
//	int age;

//	public Dog(String value, String tuoi) {
//		name = value;
//		age = Integer.parseInt(tuoi);	
//	}
	
	public Dog(String value) {
		name = value;	
	}

	void display() {
		System.out.println(name);
//		System.out.println(age);
	}

	public static void main(String[] args) {
		System.out.println("Start");
		
//		Dog dog1 = new Dog("Dog 1",10);
//		dog1.display();
//		
//		Dog dog2 = new Dog("Dog 2",15);
//		dog2.display();
		
//		Dog dog1 = new Dog(args[0], args[1]);
//		dog1.display();
//		
//		Dog dog2 = new Dog(args[2], args[3]);
//		dog2.display();
//		System.out.println("-For");
		for(int i = 0; i < 10; i++) {
			Dog dog = new Dog("Dog " + (i+1));
			dog.display();
		}
//		for(int i = 0; i < 10; i++) {
//			Dog dog = new Dog("Dog " + (i+1));
//			arrayDog[i]= dog;
//		}
		System.out.println("End");
	}
}