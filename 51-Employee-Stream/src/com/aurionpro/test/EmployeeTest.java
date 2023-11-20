package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Arrays.asList(
				new Employee(101,"Umaid",120000,"HR"),
				new Employee(102,"Dipika",100000,"HR"),
				new Employee(103,"Sahil",12000,"Developer"),
				new Employee(104,"Siddhi",69000,"Trainee")	
				
				);

		 Map<String, List<Employee>> collect = employeeList.stream()
				 .collect(Collectors.groupingBy(Employee::getDept));
				  
		 System.out.println(collect);
	
	collect.forEach((Key,Value)->{
		System.out.println((Key+":"+Value));
	});
	
	List<Employee> money = employeeList.stream()
			.filter((emp) -> (emp.getSalary() >= 50000))
			.collect(Collectors.toList());
	
	money.forEach(System.out::println);
	
	Optional<Employee> max = employeeList.stream()
			.max(Comparator.comparingDouble(Employee::getSalary));
			System.out.println(max.get());
	
			
	Optional<Employee> min = employeeList.stream()
	.min(Comparator.comparingDouble(Employee::getSalary));
	System.out.println(min.get());
	

	
//	employeeList.stream()
//	map((employee)->employee.getSalary());
//	
}
}