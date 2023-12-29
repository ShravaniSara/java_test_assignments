package src.assignments;

public class Employee {
	
	public int salary;
	public int basicSal;
	
	public void calculateSalary(int basicSalary, int bonus) {
		//System.out.println(basicSalary);
		//int basicSalary = 20000;
		salary = basicSalary + bonus;
		System.out.println(salary);
	}

}
