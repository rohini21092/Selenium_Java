package testNgProgram;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@Test(dataProvider="getDetails")
	public void setData(String uname,String pass){
		System.out.println("the user name="+uname);
		System.out.println("password ="+pass);
		 
	}
	
	@Test(dataProvider="details")
	public void setdata1(String uname,String space,String pass) {
		System.out.println("the user name="+uname);
		System.out.println("blank ="+space);
		System.out.println("password ="+pass);
	}
	
	@DataProvider
	public Object[][] getDetails(){
		
		Object[][] data=new Object[3][3];
		data[0][0]="admin";
		data[0][1]="admin";
		data[1][0]="";
		data[1][1]="";
		data[2][0]="guest2";
		data[2][1]="guest123";
				
		return data;
	}
	
	
	
	@DataProvider(name="details")
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		data[0][0]="admin";
		data[0][1]="admin";
		data[0][2]="url";
		data[1][0]="";
		data[1][1]="";
		data[1][2]="";
		data[2][0]="guest2";
		data[2][1]="guest123";
		data[2][2]="abc";
				
		return data;
	}
}
