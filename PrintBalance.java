import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * DONE A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2011.
 */
public class PrintBalance{
	public static String language;
	public static String country;
	public static String name;
	public static String greeting;
	public static String getName;
	public static String meet;
	public static String asOf;
	public static String owe;
	public static String farewell;

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		// I got rid of the scanner and put the name in the args to make testing easier
		//Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		
		language = args[0];
		country = args[1];
		name = args[2];
		
		Locale currentLocale = new Locale(language, country);
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		
		//Greeting
		greeting = messages.getString("greeting");
		System.out.println(greeting);

		//Get User's Name
		getName = messages.getString("getname");
		System.out.println(getName);
		//String name = scanInput.nextLine();
		meet = messages.getString("meet");
		System.out.println(meet + name);
		
		//print today's date, balance and bid goodbye
		DateFormat dateFormat = DateFormat.getDateTimeInstance(0, 0, messages.getLocale());
		asOf = messages.getString("asof");
		System.out.println(asOf + dateFormat.format(today));
		NumberFormat numFormat = NumberFormat.getCurrencyInstance(messages.getLocale());
		owe = messages.getString("owe");
		System.out.println(owe + numFormat.format(9876543.21));
		farewell = messages.getString("farewell");
		System.out.println(farewell);
	}
}