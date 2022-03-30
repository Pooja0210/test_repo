package com.zensar;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}
}

class Manager extends Employee {
	private double incentive;

	public Manager(int id, String name, double salary, double incentive) {
		super(id, name, salary);
		this.incentive = incentive;
	}

	public double getSalary() {
		return  super.getSalary() + this.incentive;
	}
	
}

class Labour extends Employee {
	private double overtime;

	public Labour(int id, String name, double salary, double overtime) {
		super(id, name, salary);
		this.overtime = overtime;
	}

	public double getSalary() {
		return super.getSalary()+this.overtime;
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp[] = new Employee[4];
		emp[0] = new Manager(1, "Tom", 10000, 2000);
		emp[1] = new Manager(2, "Jerry", 12000, 3000);
		emp[2] = new Labour(3, "Ivan", 5000, 2000);
		emp[3]= new Labour(4, "Belly", 6000, 5000);
		double totalSalOfAllEmployees = getTotalSalOfEmployees(emp);  
		System.out.println("totalSalOfAllEmployees = " + totalSalOfAllEmployees);
	}
		public static double getTotalSalOfEmployees(Employee[] e) {
			double totalSalOfAllEmployees = 0.0;
			for(int i=0;i<e.length;i++) {
				totalSalOfAllEmployees = totalSalOfAllEmployees + e[i].getSalary();
			}
			return totalSalOfAllEmployees;
		}
//		Manager m1 = new Manager(1, "Tom", 10000, 2000);
//		Manager m2 = new Manager(2, "Jerry", 12000, 3000);
//		Labour l1 = new Labour(3, "Ivan", 5000, 2000);
//		Labour l2 = new Labour(4, "Belly", 6000, 5000);
//
//		double totalSalOfAllEmploees = m1.getSalary() + m1.getIntensive() + m2.getSalary() + m2.getIntensive()
//				+ l1.getSalary() + l1.getOvertime() + l2.getSalary() + l2.getOvertime();
//		System.out.println("totalSalOfAllEmployees = " + totalSalOfAllEmploees);
		
		

	
	}

	

