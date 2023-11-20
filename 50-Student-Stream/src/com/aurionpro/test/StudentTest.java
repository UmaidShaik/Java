package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List<Student> student = Arrays.asList(
        		  new Student(1,"Umaid",80.9,Arrays.asList("Playing","GYM")),
        		  new Student(2,"Dipika",70.6,Arrays.asList("reading","Dancing")),
        		  new Student(3,"Sahil",78.5,Arrays.asList("singing","Dancing")),
        		  new Student(4,"Rahul",75.8,Arrays.asList("gym","Dancing"))
        		  );

//        		  List<Student> highpercent = Arrays.stream(student)
//        				  .filter((Student)->Student.getPercentage())
//        				  .collect(Collectors.toList());
          
          
              	  List<Object> list = student.stream()
              			  .map((Student)->Student.getHoobies())
              			  .flatMap((List)->List.stream())
              			  .distinct()
              			  .collect(Collectors.toList());
            System.out.println(list);
        		  
          
	}

}
