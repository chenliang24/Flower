package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//String�������������黥��ת��
		String[] s = {"aa","bb","cc"};
		LinkedList<String> list = new LinkedList<>(Arrays.asList(s));
		
		String[] s1 = new String[list.size()];
		list.toArray(s1);
		
		//ArrayList �ļ��������Լ�����
		ArrayList<String> collection1 = new ArrayList<>();
		collection1.add("�Ϻ�");
		collection1.add("����");
		collection1.add("�㶫");
		collection1.add("����");
		
		System.out.println(collection1);
		System.out.println(collection1.contains("�Ϻ�")); //collection1���Ƿ�������Ϻ���
		                                                  //����boolean����
		
		collection1.remove("�Ϻ�");   //ɾ��collection1�еġ��Ϻ���
		System.out.println(collection1.size());
		
		Collection<String> collection2 = new ArrayList<>();
		collection2.add("�ӱ�");
		collection2.add("����");
		collection2.add("����");
		collection2.add("����");
		System.out.println(collection2);
		
		System.out.println("------------------------------------------------------------------------------\n\n");
		
		ArrayList<String> c1 =(ArrayList<String>) (collection1.clone()); //��¡collection1����c1
		c1.addAll(collection2);  //���collection2�����е�Ԫ�ص�c1��
		System.out.println(c1);  //��ӡc1�����е�Ԫ��

		c1 =(ArrayList<String>) (collection1.clone());
		c1.retainAll(collection2);  //���ز������� ���������� collection ����ЩҲ������ָ�� collection ��Ԫ�أ���ѡ�����������仰˵���Ƴ��� collection ��δ������ָ�� collection �е�����Ԫ�ء�   
		                            //���c1 �� collection2������ͬ��Ԫ�� ����true ��ɾ����ͬ��Ԫ��
		                            //���c1 �� collection2�е�Ԫ�ض���ͬ  û��ɾ���κ�Ԫ�� �򷵻�false
		System.out.println(c1);
		
		System.out.println("----------------------------------------------------------------------------\n\n");
		
		c1=(ArrayList<String>) collection1.clone();
		c1.removeAll(collection2);   //ɾ��c1 �� collection2 ��������ͬ��Ԫ��
		System.out.println(c1);      //�˴���ֻ���ع㶫������  �Ϻ������ĵĴ������Ѿ���ɾ��
		
		LinkedList<Integer> aa =new LinkedList<>();
		
		
	}

}
