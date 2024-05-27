package com.mycom.project1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Student")
public class Student 
{
	@Id
	private String sid;
	private String sname;
	public Student() 
	{
		super();
	}
	public Student(String sid, String sname) 
	{
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	

}
