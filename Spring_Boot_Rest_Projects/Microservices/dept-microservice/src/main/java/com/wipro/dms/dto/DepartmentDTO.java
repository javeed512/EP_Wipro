package com.wipro.dms.dto;

public class DepartmentDTO {
	
	
	private long  dno;
	private  String dname;
	private  String location;
	private  int  eid;
	
	public DepartmentDTO() {
		
		
	}
	
	public DepartmentDTO(long dno, String dname, String location, int eid) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.location = location;
		this.eid = eid;
	}

	public long getDno() {
		return dno;
	}

	public void setDno(long dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + ", location=" + location + ", eid=" + eid + "]";
	}
	

	
	
	

}
