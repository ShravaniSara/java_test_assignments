package src.assignments;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an obj of animal and call the printinfo method of animal
		
		Animal animal = new Animal();
		Animal dog = new Dog();
		
		//dog.setName("");



		
		dog.setName("tuffy");
		dog.setAge(2);
		dog.printInfo();

		
		Animal cat = new Cat();
		
		//dog.setName("");
		
		
		cat.setName("stuffy");
		cat.setAge(2);
		cat.printInfo();
		
		
		Car car = new Car("",123);
		
		System.out.println("Test");
		
		Shape circle = new Circle();
		
		circle.calculateArea();
		
		Shape rectangle = new Rectangle();
		
		rectangle.calculateArea();
		
		Employee manager = new Manager();
		manager.basicSal = 20000;
		manager.calculateSalary(manager.basicSal,2000);
		
		Employee developer = new Developer();
		developer.basicSal = 10000;
		developer.calculateSalary(developer.basicSal,1000);
		

	}

}
