package entity;


import java.sql.Timestamp;

public class Order {   //订单信息实体类
	
	private int oid;   //订单id
	private int onum;   //订单号
	private int uid;       //购买人(user类)id 外键
	private double ototal; //
	private int aid;  
	private int ostate;
	private Timestamp otime;  //订单时间
	private User user;    
	private Address address;
	
	
	
}
