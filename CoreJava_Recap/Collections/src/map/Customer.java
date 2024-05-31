package map;

import java.util.Objects;

public class Customer {
	
	
	private int cid;
	private String cname;
	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
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
	@Override
	public int hashCode() {
		return Objects.hash(cid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return cid == other.cid;
	}
	@Override
	public String toString() {
		return  this.cid+"";
	}
	
	
	
	
	

}
