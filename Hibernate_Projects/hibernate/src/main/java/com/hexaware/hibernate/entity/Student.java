package com.hexaware.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Info")



@NamedQueries({
	@NamedQuery(name="getAll" , query = "Select s from Student s where s.fee > 20000"),
	@NamedQuery(name="getStudent" , query ="Select s from Student s where s.sid = :id")
})
public class Student {
	
		@Id
		private int sid;
		@Column(name="studentName")
		private String sname;
		private double fee;
		
		
		public Student() {
			
		}
		
		
		public Student(int sid, String sname, double fee) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.fee = fee;
		}


		public int getSid() {
			return sid;
		}


		public void setSid(int sid) {
			this.sid = sid;
		}


		public String getSname() {
			return sname;
		}


		public void setSname(String sname) {
			this.sname = sname;
		}


		public double getFee() {
			return fee;
		}


		public void setFee(double fee) {
			this.fee = fee;
		}


		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", fee=" + fee + "]";
		}
	
		
		
		
		
	

}
