package interviewDataStructures;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat
	{
	 public static void main(String[] args)
	  {
	    final String OLD_FORMAT = "dd MMM yyyy";
	    final String NEW_FORMAT = "yyyy-MM-dd";
	    try
	    {
	      String userInput = "1st Aug 2016";
	      userInput = userInput.replaceAll("[thsnd]", "");
	      String newDateString;

	      SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
	      Date d = sdf.parse(userInput);
	      sdf.applyPattern(NEW_FORMAT);
	      newDateString = sdf.format(d);
	      
	      System.out.println(newDateString);
	    }
	    catch (ParseException e)
	    {
	      
	      e.printStackTrace();
	    }
	  }
	}

