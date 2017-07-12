package com.springdemo.beanwiring;

public class Collage {
	private String cName;
	private Student std;
	
	public Collage(Student student) {
		super();
		this.std = student;
	}

	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	
}
