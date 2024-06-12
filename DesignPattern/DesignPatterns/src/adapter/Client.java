package adapter;

public class Client {

	public static void main(String[] args) {


		 Printer printer = new PrinterAdapter();
		 
		 printer.print("Hello friends");
		

	}

}
