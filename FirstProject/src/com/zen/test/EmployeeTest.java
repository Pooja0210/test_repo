package com.zen.test;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface Getter {
	String name() default "Pooja";	
}
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
	
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
@Getter
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
		Class classEmployee = Employee.class;
		Annotation annotations[] = classEmployee.getDeclaredAnnotations();
		Method method =classEmployee.getDeclaredMethod("toString",null);
		annotations = method.getAnnotations();
		for(int i=0;i<annotations.length;i++)
			System.out.println(annotations[i]);
		Employee employee = new Employee(1,"Tom",5000.0);
		
		
		annotations = method.getAnnotations();
		
		
	for(int i=0;i<annotations.length;i++) {
			System.out.println(annotations[i]);
		}
		
		}
	}
		


