package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Demo0801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo0801 test = new Demo0801();
//		test.twoArray();
//		test.paobi();
//		test.daojishi();
//		test.studntChngji();
//		test.testCollection();
//		test.testHashSet();
//		test.testForEach();
//		test.testSet();
//		test.testTreeSet();
//		test.zidingyi();
//		test.testList();
		test.testMap();
	}

	private void twoArray() {
		// TODO Auto-generated method stub
		int[][] num = { { 1 }, { 2, 3, 4, 5 }, { 3, 6, 9, 8, 0 }, { 2, 3 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j].length < num[j + 1].length) {
					int[] temp = new int[10];

				}
			}
		}
		for (int i = 0; i < num[0].length; i++) {
			int count = 0;
			for (int j = 0; j < num.length; j++) {
				count += num[j][i];
			}
			System.out.println("第" + i + "列的和为：" + count);
		}
		System.out.println(num.length);
	}

	private void paobi() {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		for (int i = 1; i <= 1000000; i++) {
			int c = (int) (Math.random() * 2);

			if (c == 0) {
				a++;
			} else {
				b++;
			}
		}
		System.out.println("正面：" + a);
		System.out.println("反面：" + b);

	}

	private void daojishi() {
		// TODO Auto-generated method stub
		System.out.println("输入秒数：");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for (int i = a; i >= 0; i--) {
			if (i == 0) {
				System.out.println("Stopped");
			} else {
				System.out.println("还有" + i + "秒");
			}
		}
	}

	private void studntChngji() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		Set<Student> collSet = null;
		Student stu = new Student();
		stu.setName(in.next());
		stu.setChJi(in.nextInt());
		collSet = StuSet(stu, num);
		for (Student student : collSet) {
			System.out.println("姓名：" + student.getName() + " 成绩：" + student.getChJi());
		}
	}

	private Set<Student> StuSet(Student s, int num) {
		Set<Student> stu = new HashSet<Student>();
		for (int i = 0; i < num; i++) {
			stu.add(s);
		}
		return stu;

	}

	private void testCollection() {
		// TODO Auto-generated method stub
		Collection<Student> coll = new HashSet<Student>();
		Student stu1 = new Student("zhsan", 57);
		Student stu2 = new Student("zhsan", 67);
		Student stu3 = new Student("sdadsf", 78);
		coll.add(stu1);
		coll.add(stu2);
		coll.add(stu3);
		Iterator<Student> iterator = coll.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}

	}

	private void testHashSet() {
		// TODO Auto-generated method stub
		Collection<Student> collection = new HashSet<Student>();
		Student stu1 = new Student("zhsan", 57);
		Student stu2 = new Student("zhsa2n", 67);
		Student stu3 = new Student("sdadsf", 78);
		Student stu4 = new Student("sd", 74);
		collection.add(stu1);
		collection.add(stu2);
		collection.add(stu3);
		collection.add(stu4);
		Iterator<Student> it = collection.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "  " + s.getChJi());
		}
	}

	private void testForEach() {
		// TODO Auto-generated method stub
		Collection<Student> eCollection = new HashSet<Student>();
		Student stu1 = new Student("zhsan", 57);
		Student stu2 = new Student("zhsa2n", 67);
		Student stu3 = new Student("sdadsf", 78);
		Student stu4 = new Student("sd", 74);
		eCollection.add(stu1);
		eCollection.add(stu2);
		eCollection.add(stu3);
		eCollection.add(stu4);
		for (Student student : eCollection) {
			System.out.println("姓名：" + student.getName() + " 成绩：" + student.getChJi());
		}
	}

	private void testSet() {
		// TODO Auto-generated method stub
		Set<Student> setStu = new HashSet<Student>();
		Student stu1 = new Student("zhsan", 57);
		Student stu2 = new Student("zhsa2n", 67);
		setStu.add(stu1);
		setStu.add(stu2);
		System.out.println(setStu.size());
		for (Student student : setStu) {
			System.out.println(student.toString());
		}
	}

	private void testTreeSet() {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int num = 3;// in.nextInt();
		Set<Student> setStu = new TreeSet<Student>();
		Student stu1 = new Student("zhsan", 57);
		Student stu2 = new Student("zhsa2n", 67);
		Student stu3 = new Student("sdadsf", 78);
		Student stu4 = new Student("sd", 74);
		setStu.add(stu1);
		setStu.add(stu2);
		setStu.add(stu3);
		setStu.add(stu4);

		for (Student student : setStu) {
			System.out.println(student.toString());
		}

	}

	private void zidingyi() {
		// TODO Auto-generated method stub
		Set<Student> setStu = new TreeSet<Student>(new MyComparator());
		Student stu1 = new Student("zhsan", 57);
		Student stu2 = new Student("zhsa2n", 67);
		Student stu3 = new Student("sdadsf", 78);
		Student stu4 = new Student("sd", 74);
		setStu.add(stu1);
		setStu.add(stu2);
		setStu.add(stu3);
		setStu.add(stu4);
		for (Student student : setStu) {
			System.out.println(student);
		}
	}

	private void testList() {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		Student stu1 = new Student("zhsan", 57);
		Student stu2 = new Student("zhsa2n", 67);
		Student stu3 = new Student("sdadsf", 78);
		Student stu4 = new Student("sd", 74);
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
//		for (Student student : list) {
//			System.out.println(student);
//		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		Collections.sort(list);
		Collections.sort(list, new MyComparator());
		String[] strArray = new String[list.size()];
		list.toArray(strArray);
		for (String string : strArray) {
			System.out.println(string);
		}
	}

	private void testMap() {
		// TODO Auto-generated method stub
		Student s1 = new Student("adf", 78);
		Student s2 = new Student("adf", 78);
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("stu1", s1);
		map.put("stu2", s2);
//		for (String s : map.keySet()) {
//			System.out.println("key=" + s + " vlaue=" + map.get(s));
//		}

		for (Map.Entry<String, Student> s : map.entrySet()) {
			System.out.println("key=" + s + " vlaue=" + map.get(s));
		}
	}

	private void testVector() {
		// TODO Auto-generated method stub
		Vector<String> vScoreStrings = new Vector<String>();
		vScoreStrings.add("aaa");
		vScoreStrings.add("bbb");
		vScoreStrings.add("ccc");
		for (int i = 0; i < vScoreStrings.size(); i++) {
			System.out.println(vScoreStrings.get(i) + " ");
		}
		vScoreStrings.set(1, "fgf");
		vScoreStrings.remove(0);

		for (int i = 0; i < vScoreStrings.size(); i++) {
			System.out.println(vScoreStrings.get(i) + " ");
		}
	}

	private void testHashTable() {
		// TODO Auto-generated method stub
		Hashtable<String, String> thst = new Hashtable<String, String>();
		thst.put("asd", "23453");
		thst.put("asdx", "23455");
		thst.put("asdf", "23454");
		System.out.println(thst.toString());
		thst.put("asdx", "asdfas");
		thst.remove("asd");
		System.out.println(thst.toString());
	}
}
