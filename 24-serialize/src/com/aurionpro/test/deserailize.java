package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Account;

public class deserailize {
	
	Account account = new Account("1","raj",20000);
	try {
		FileInputStream file = new FileInputStream("C:\\Users\\umaid.shaikh\\Desktop\\serailize\\test.txt");
		ObjectInputStream out = new ObjectInputStream(file);
		out.readObject(account);
		out.close();
		file.close();
		System.out.println("done serialize");
	}
	catch(Exception e) {
		e.printStackTrace();
	}

}
