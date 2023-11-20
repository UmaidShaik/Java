package com.aurionpro.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeUtil {

	List<Employee> employeeList;
	private static boolean initialLoad = false;

	public EmployeeUtil() {
		this.employeeList = new ArrayList<>();
		loadEmployee();
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	@SuppressWarnings("unchecked")
	private void loadEmployee() {
		if (checkIfFileEmpty() && !initialLoad) {
			employeeList = new EmployeeReader().readEmployeeFromFile("C:\\Users\\umaid.shaikh\\Downloads\\emp.txt");
			initialLoad = true;
		} else if (!checkIfFileEmpty()) {
			try {
				FileInputStream file = new FileInputStream("C:\\Users\\umaid.shaikh\\Desktop\\serailize\\emp.txt");
				ObjectInputStream in = new ObjectInputStream(file);

				this.employeeList = (List<Employee>) in.readObject();

				in.close();
				file.close();

				System.out.println("Object de-serialized successfully");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
		saveEmployeeList();
	}

	public void removeEmployee(Employee employee) {
		if (employeeList.contains(employee)) {
			employeeList.remove(employee);
			saveEmployeeList();
		}

	}

	private void saveEmployeeList() {
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\umaid.shaikh\\Desktop\\serailize\\emp.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(employeeList);

			out.close();
			file.close();

			System.out.println("Object serialized successfully");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean checkIfFileEmpty() {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\umaid.shaikh\\Desktop\\serailize\\emp.txt");
			if (file.read() != -1) {
				return false;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	public void findemp() {
		System.out.println("Enter the Department Id");
		Scanner sc = new Scanner(System.in);
	    int targetid = sc.nextInt();
			List<Employee> employeesInDepartment = new ArrayList<>();
	     int count = 0;
	     for (Employee emp : employeeList) {
	         if (emp.getDepartmentId() == targetid) {
	             employeesInDepartment.add(emp);
	             count++;
	         }
	     }
	
	     System.out.println("Employees in department " + targetid + ":" + "Count " + count);
	     for (Employee emp : employeesInDepartment) {
	         System.out.println(emp.getName());
	         }
	    }
	
	public void findEmpManager() {
		System.out.println("Enter the emp id");
		Scanner sc = new Scanner(System.in);
	    int targetid = sc.nextInt();
	    List<Employee> Emp1 = employeeList.stream().filter((a)->a.getId()==targetid).collect(Collectors.toList());
	    for(Employee x: Emp1) {
	    	employeeList.stream().filter((a)->a.getId()==x.getManagerId()).forEach(System.out::println);
	    }
//	    List<Employee> Emp2 = employeeList.stream().filter((a)->a.getId()==Emp1[0]).collect(Collectors.toList());

	}
	
	public void highsalarydept() {
		
		System.out.println("Enter the Dept id");
		Scanner sc = new Scanner(System.in);
	    int deptid = sc.nextInt();
	   Optional<Employee> max = employeeList.stream().filter((a)->a.getDepartmentId()==deptid).max(Comparator.comparing(Employee::getSalary));
	    System.out.println(max.get());
	    
	}
	
public void highsalaryroll() {
		
		System.out.println("Enter the role");
		Scanner sc = new Scanner(System.in);
	    String role = sc.next();
	   Optional<Employee> max = employeeList.stream().filter((a)->a.getRole().equalsIgnoreCase(role)).max(Comparator.comparing(Employee::getSalary));
	    System.out.println(max.get());
	    
	}

public void highestCommission() {
	System.out.println("Highest commission");
	 Optional<Employee> max = employeeList.stream().max(Comparator.comparing(Employee::getCommission));
	    System.out.println(max.get());
}

public void sumofsalary() {
	System.out.println("Sum of salary");
	double sum = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
	System.out.println(sum);
}

public void todate() {
	Scanner sc = new Scanner(System.in);
	System.out.print("From date : ");
	String d1=sc.next();
	System.out.print("To date : ");
    String d2=sc.next();
	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate dateTime1 = LocalDate.parse(d1, formatter1);
	
	DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate dateTime2 = LocalDate.parse(d2, formatter2);
	
		List<Employee> employeesJoined = new ArrayList<>();
	
	for (Employee emp: employeeList) {
		if (emp.getDateOfJoining().isAfter(dateTime1) && emp.getDateOfJoining().isBefore(dateTime2)) {
			employeesJoined.add(emp);
		}
	}
	
	if (employeesJoined.size() == 0) {
		System.out.println("No employees found between following two dates");
	} else {
		System.out.println(employeesJoined);
	}

}

}
