package nov2;

import java.time.LocalDate;
import java.time.Period;

public class DateAge {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();                         
		LocalDate birthday = LocalDate.of(1998, 12, 5);  		 
		Period p = Period.between(birthday, today);		 
		System.out.println(p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days ");
		
	}

}
