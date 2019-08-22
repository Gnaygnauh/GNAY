package com.test;

public class Student implements Comparable<Student> {
	private String name;
	private int chJi;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int chJi) {
		super();
		this.name = name;
		this.chJi = chJi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChJi() {
		return chJi;
	}

	public void setChJi(int chJi) {
		this.chJi = chJi;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", chJi=" + chJi + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.chJi > o.chJi) {
			return -1;
		} else if (this.chJi < o.chJi) {
			return 1;
		}
		return 0;
	}

}
