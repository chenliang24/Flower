package entity;

public class Address {
	private int aid;
	private int uid; //用户id 外键
	private String aname; //收货人姓名
	private String atel;   //收货人电话
	private String aaddr; //收货地址
	private String aemail; //送货邮箱
	private User user; //用户信息 外键
	
}
