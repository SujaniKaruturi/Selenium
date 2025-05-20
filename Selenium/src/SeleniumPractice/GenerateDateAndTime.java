package SeleniumPractice;

import java.util.Date;

public class GenerateDateAndTime {

	public static void main(String[] args)
	{
		
		Date d1= new Date();
		d1.getDate();   //Depreciated method(RIP),should not use these any more.
		System.out.println(d1.getTime());   //Epoch Time
		Date d2=new Date(d1.getTime());
		System.out.println(d2);    //Human time
		String Humantime = d2.toString();  //converting date format into string
		int len = Humantime.length();
		System.out.println("Length of String Time is " +len); //index starts from 0
		
		String year = Humantime.substring(24);    //substring with 1 parameter
		System.out.println("Year "+ year); 
		String month = Humantime.substring(4,7);	//substring with 2 parameter(n,n-1)
		System.out.println("Month "+month); 
		String date = Humantime.substring(8,10);
		System.out.println("Date "+date); 
		
		String fdate = date.concat(month).concat(year);
		System.out.println("full Date "+fdate);   //current date
		
		String fdate1 = date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println("full Date with spcae "+fdate1); 
		
		String fdate2 = date.concat("-").concat(month).concat("-").concat(year);
		System.out.println("full Date with hifen "+fdate2); 
		
		//1sec =1000 milliseconds,24 hrs,60 mins,60secs,no:of days
		Date d3=new Date(d1.getTime()+(1000*24*60*60*2));  
		System.out.println("furture time after 2 days from current time " +d3);   
		
		Date d4=new Date(d1.getTime()+(1000*24*60*60*10));  
		System.out.println("furture time after 10 days from current time " +d4);   
		
		Date d5=new Date(d1.getTime()-(1000*24*60*60*9));  
		System.out.println("past time before 10 days from current time " +d5);  
		
		
	}

}
