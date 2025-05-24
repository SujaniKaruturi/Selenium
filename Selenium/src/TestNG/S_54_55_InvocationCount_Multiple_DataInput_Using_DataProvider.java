package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//54. WAP to do registration using below fields firstnam,lastname,DOB,mail,Gender using data provider
//55. Program to run same testcase multiple times using invocation count
public class S_54_55_InvocationCount_Multiple_DataInput_Using_DataProvider {

	@DataProvider(name="Set1")
	public Object[][] Fname()
	{
		Object[][] fname=new Object[3][1];
		fname[0][0]="Suajni";
		fname[1][0]="Krishna";
		fname[2][0]="RaviTeja";
		return fname;
		
	}
	
	@Test(dataProvider= "Set1" ,invocationCount =3)
	public void fname_input(String fname)
	{
		System.out.println(" fname is " + fname);
	}
	
	@DataProvider(name="Set2")
	public Object[][] Lname()
	{
		Object[][] lname=new Object[3][1];
		lname[0][0]="Nalla";
		lname[1][0]="Rushika";
		lname[2][0]="Karuturi";
		return lname;
		
	}
	@Test(dataProvider= "Set2")
	public void lname_input(String lname)
	{
		System.out.println(" lname is " + lname);
	}
	
	
	
	@DataProvider(name="Set3")
	public Object[][] multiple_input()
	{
		Object[][] m_input=new Object[3][3];
		m_input[0][0] = "11-11-1995";
		m_input[1][0] = "20-09-1992";
		m_input[2][0] = "18-09-2023";
		
		m_input[0][1] = "sujani@gmail.com";
		m_input[1][1] = "Rushika@gmail.com";
		m_input[2][1] = "Raviteja@gmail.com";
		
		m_input[0][2] = "Female";
		m_input[1][2] = "Female";
		m_input[2][2] = "Male";
		return m_input;
		
	}
	@Test(dataProvider= "Set3")
	public void multiple_Input(String dob,String mail,String gender)
	{
		System.out.println(" DOB is " + dob + "Mail id is "+ mail + "Gender is" + gender);
	}
	
	
}
