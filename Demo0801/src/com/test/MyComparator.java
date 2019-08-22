package com.test;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		if (o1.getChJi() > o2.getChJi()) {
			return -1;
		} else if (o1.getChJi() == o2.getChJi()) {
			return 0;
		} else {
			return 1;
		}

	}

}
