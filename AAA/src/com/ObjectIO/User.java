package com.ObjectIO;

import java.io.Serializable;

public class User implements Serializable{   //д��һ���������ʵ�������ǽӿ�//��ǽӿ�
	                                         //java�ĺܶ��඼ʵ��������ӿ�
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8324319250464820654L;   //����ID
	private int id;
	private  String name;
	private transient int paw;   //�ؼ���transient ���Ϊ�����л�����  ���ɱ�д��
	
	public User() {
		super();
	}
	
	
	public User(int id, String name, int paw) {
		super();
		this.id = id;
		this.name = name;
		this.paw = paw;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPaw() {
		return paw;
	}
	public void setPaw(int paw) {
		this.paw = paw;
	}
	

}
