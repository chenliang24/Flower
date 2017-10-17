package entity;

import java.sql.Timestamp;

public class Comment {
	private int coid;
	private int uid;     //评论人id
	private int pid;     //商品id
	private Timestamp ctime;    //评论时间
	private String ccontent;    //评论内容
	private User user;
	private Product product;

}
