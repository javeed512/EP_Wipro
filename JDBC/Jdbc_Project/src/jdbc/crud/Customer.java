package jdbc.crud;

import java.sql.Date;

public class Customer {
	
	
	private int cid;
	private String cname;
	private  Date dob;
	private  double amount;
	
	public Customer() {
		
		
	}
	
	
	public Customer(int cid, String cname, Date dob, double amount) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.dob = dob;
		this.amount = amount;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", dob=" + dob + ", amount=" + amount + "]";
	}
	
	
	
	

}
