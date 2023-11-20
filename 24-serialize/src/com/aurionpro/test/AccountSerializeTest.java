package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Account;

public class AccountSerializeTest {
	
	public static void main(String[] args) {
		
		Account account = new Account("1","raj",20000);
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\umaid.shaikh\\Desktop\\serailize\\test.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(account);
			out.close();
			file.close();
			System.out.println("done serialize");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
