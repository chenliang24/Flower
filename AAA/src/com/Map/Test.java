package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class Test {

	public static void main(String[] args) {
		Map<String,Integer> students = new HashMap<>();
		students.put("tom", 20);
		students.put("jerry", 19);
		students.put("ben", 55);
		students.put("ben", 30);
		
		
		System.out.println("��tom��ֵ��:"+ students.get("tom"));
		
		Set<String> keys =students.keySet();   //ȡ�����еļ�����Щ������Set����ʽ���ֵģ���Set��key��Ϊ�˼������ظ�
		Collection<Integer> values =students.values();  //ȡ�����е�ֵ
		System.out.println(keys);
		System.out.println(values);
		
		System.out.println("����Map");
		for(String key : students.keySet()){
			System.out.printf("%-7s  %-4d  \n",key,students.get(key));
		}
		
		//lamdba���ʽ
		System.out.println("����Map");
		students.forEach((k ,y) -> System.out.printf("%-8s %-4d \n",k,y));
		
		

	}

}
