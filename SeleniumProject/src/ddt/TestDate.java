package ddt;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class TestDate{
	
	@Test
	public void getDate() {
		Date d1 =new Date();
		System.out.println("default date is "+d1);
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		String fdate=date.format(d1);
		System.out.println(fdate);
		System.out.println("future or past date ="+futureOrPastDate(-5));
		 		
		
	}
	public String futureOrPastDate(int number) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, number);
		SimpleDateFormat d1= new SimpleDateFormat("dd/MM/yyyy");
		return d1.format(cal.getTimeInMillis());
		
	}
	
	
}
