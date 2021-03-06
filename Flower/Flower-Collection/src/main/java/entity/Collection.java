package entity;

public class Collection {
	private int colid;
	private int uid;
	private int pid;
	private User user;
	private Product product;
	public Collection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collection(int uid, int pid, User user, Product product) {
		super();
		this.uid = uid;
		this.pid = pid;
		this.user = user;
		this.product = product;
	}
	public Collection(int colid, int uid, int pid, User user, Product product) {
		super();
		this.colid = colid;
		this.uid = uid;
		this.pid = pid;
		this.user = user;
		this.product = product;
	}
	public int getColid() {
		return colid;
	}
	public void setColid(int colid) {
		this.colid = colid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Collection [colid=" + colid + ", uid=" + uid + ", pid=" + pid + "]";
	}
	

}
