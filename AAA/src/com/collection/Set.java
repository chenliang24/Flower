package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set{

	public static void main(String[] args) {
	     //Set �������
		 HashSet<Integer> set1 = new HashSet<>();
		 set1.add(5);
		 set1.add(3);
		 set1.add(7);
		 set1.add(2);
		 
	     set1.forEach(e ->System.out.println(e));  //lambda���ʽ
		 System.out.println("-------------------------------------");
		 
	     //LinkedHashSet ĳ���������������
		 LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		 set2.add(5);
		 set2.add(3);
		 set2.add(7);
		 set2.add(2);
		 set2.forEach(System.out::println);  //��ӡ�����﷨
		 System.out.println("-------------------------------------");
		 
		 //TreeSet
		 TreeSet<String> set3 = new TreeSet<>();
		 set3.add("b����");
		 set3.add("s�Ϻ�");
		 set3.add("h��ʢ��");
		 set3.add("g�㶫");
		 set3.add("s����");
		 System.out.println(set3);    //
		 System.out.println(set3.first());
		 System.out.println(set3.last());
		 System.out.println(set3.headSet("h"));
		 System.out.println(set3.tailSet("h"));
		 

	}

}
