package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
		private transient int eid;
		private   String ename;  // declare it static and try
		public Employee(int eid, String ename) {
			super();
			this.eid = eid;
			this.ename = ename;
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + "]";
		}
		
		
	

}
