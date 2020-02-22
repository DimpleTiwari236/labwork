package vjit;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestDate 
{

	@Test
	public void testGetDay() 
	{
		DateExample d = new DateExample(41,5,1998);
		if(d.getDay()>=1 && d.getDay()<=31 && d.getMonth()!=2)
		{
			assertEquals(31,d.getDay());
		}
		else
		{
			System.out.println("Date Must be in the range of 1-31");
		}
	}
	
	@Test
	public void testGetMonth()
	{
		DateExample d = new DateExample(31,13,1998);
		if(d.getMonth()>=1 && d.getMonth()<=12)
		{
			assertEquals(5,d.getMonth());
		}
		else
		{
			System.out.println("Month must be in the range of 1-12");
		}
	}
	
	@Test
	public void testGetYear()
	{
		DateExample d = new DateExample(29,2,2020);
		 boolean isLeap = false;
		 if(d.getYear() % 4 == 0)
	     {
			 if(d.getYear() % 100 == 0)
	         {
				 if (d.getYear() % 400 == 0)
	                    isLeap = true;
	             else
	                    isLeap = false;
	         }
	         else
	        	 isLeap = true;
	      }
	      else 
	      {
	    	  isLeap = false;
	      }
		  if(isLeap==true && d.getMonth()==2 && d.getDay()>=1 && d.getDay()<=29)
		  {
			  assertEquals(2020,d.getYear());
		  }
		  else if(isLeap == false&& d.getMonth()==2 && d.getDay()>=1 && d.getDay()<=29)
		  {
			  System.out.println("This is not a leap year and hence date in february must be in the range of 1-28");
		  }
	}

}
