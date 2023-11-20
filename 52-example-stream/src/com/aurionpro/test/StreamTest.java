package com.aurionpro.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import com.aurionpro.model.exstream;

public class StreamTest {

	public static void main(String[] args) {
		List<String> names= Arrays.asList("jayesh","Mahesh","Nimesh","Ramesh");
          names.forEach(System.out::println);
          System.out.println("*********************************************");
          names.stream().forEach(System.out::println);
          String[] names1= {"Jayesh","Nimesh","Mahesh","Ramesh"};
          Arrays.stream(names1).forEach(System.out::println);

}
}
