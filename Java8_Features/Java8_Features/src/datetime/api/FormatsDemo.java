package datetime.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatsDemo {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT); // LONG,FULL,MEDIUM,SHORT

		String str = today.format(formatter);

		System.out.println(str);
		
		
		
		DateTimeFormatter userFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
				String str2 =	today.format(userFormat);
		
					System.out.println(str2);
					
					String input = "19/06/2001";   // input from K.B
					
					LocalDate  userDate =	LocalDate.parse(input,userFormat);
					
						System.out.println(userDate);
					
	}

}
