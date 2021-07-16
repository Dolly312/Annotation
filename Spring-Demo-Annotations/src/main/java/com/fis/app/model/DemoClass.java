package com.fis.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import java.util.Comparator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class DemoClass implements Serializable,Comparable<DemoClass> {
	@Value("${demoClass.USN}")
	private int USN;
	@Value("${demoClass.Name}")
	private String Name;
	@Value("${demoClass.email}")
	private String email;
	@Value("${demoClass.branch}")
	private String branch;
	@Autowired
	Subjects subjects;
	@Autowired
	
	private File f;
	
	
	public DemoClass(int uSN, String name, String email, String branch, Subjects subjects) {
		super();
		USN = uSN;
		Name = name;
		this.email = email;
		this.branch = branch;
		this.subjects = subjects;
		
	}
	
	public int getUSN() {
		return USN;
	}
	public void setUSN(int uSN) {
		USN = uSN;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Subjects getSubjects() {
		return subjects;
	}
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
	
	public DemoClass() {
		super();
		System.out.println("Hello, I am constructor");
	}
	
	
	@Override
	public String toString() {
		return "DemoClass [STUDENT USN=" + USN + ",STUDENT Name=" + Name + ", email=" + email + ", branch=" + branch + ", subjects="
				+ subjects +  "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + USN;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemoClass other = (DemoClass) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (USN != other.USN)
			return false;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
		
	}
	public int compareTo(DemoClass o) {
		// TODO Auto-generated method stub
		return this.Name.compareTo(o.Name);
	}
	public void doInit()
	{
		System.out.println("I AM DO INIT");
        String path = "C:\\Users\\User\\workspace\\DemoProject\\src\\com\\fis\\app\\model\\DemoClass.java";
		
		try {
		
			 f = new File(path);
			 new DemoClass().doDestroy();
		} 
		catch (Exception e) {
				System.out.println(e);
		}
		
	
	
	
	}
	
	public void doDestroy()
	{
		System.out.println("I AM DO Destroy");
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.write(getName()+" - "+getUSN()+" - "+getEmail()+" - "+getBranch()+" - "+getSubjects());
			pw.close();
			System.out.println("====================Finished=====================");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	

}
