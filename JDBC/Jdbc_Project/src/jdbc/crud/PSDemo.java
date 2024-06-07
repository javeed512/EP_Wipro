package jdbc.crud;

import java.util.List;

public class PSDemo {

	public static void main(String[] args) {

		
			CustomerDAO dao = new CustomerDAO();
			
			//	dao.insert();
			//	System.out.println(dao.update());
			
			
		List<Customer>  list =	dao.selectAll();


			for (Customer customer : list) {
				
				
				System.out.println(customer);
			}
		
	}

}
