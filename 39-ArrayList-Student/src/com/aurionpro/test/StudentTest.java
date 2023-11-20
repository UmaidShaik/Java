package com.aurionpro.test;


import com.aurionpro.model.Student;

import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Comparator;  
import java.util.List;  
  
  
public class StudentTest {  
  
 public static void main(String[] args) {  
  
  List<Student> stu = new ArrayList<>();  
  
  stu.add(new Student(1, "Umaid", 90));  
  stu.add(new Student(2, "Rahul", 20));  
  stu.add(new Student(3, "Sam", 30));  
  stu.add(new Student(4, "James", 40));  
  stu.add(new Student(4, "Fab", 60));  
  
  List<Student> highest = new ArrayList<>();  
  
  for (Student x : stu) {  
   if (x.getPercentage() >= 35) {  
    highest.add(x);  
   }  
  }  
  System.out.println(highest);  
  System.out.println("==========================");  
    
  Student studentWithLeastPercentage = Collections.min(stu, Comparator.comparingDouble(Student::getPercentage));  
  
        System.out.println("Student with least percentage: " + studentWithLeastPercentage);  
          
          
          
          
        System.out.println("==========================");  
        // Sort students by percentage in ascending order  
        Collections.sort(stu, Comparator.comparingDouble(Student::getPercentage));  
  
        // Print the sorted list  
        System.out.println("Students sorted by percentage in ascending order:");  
        for (Student student : stu) {  
            System.out.println(student);  
        }  
        
        System.out.println("==========================");  
        // Sort students by name in ascending order  
        Collections.sort(stu, Comparator.comparing(Student::getName));
  
        // Print the sorted list  
        System.out.println("Students sorted by Name in ascending order:");  
        for (Student student : stu) {  
            System.out.println(student);  
        }  
  
 }
}
