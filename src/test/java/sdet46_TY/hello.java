package sdet46_TY;

public class hello {

	public static void main(String[] args) 
	{
		String 	BROWSER=System.getProperty("browser");
		String ENV=System.getProperty("url");
		
		System.out.println("BROWSER   ==>> "+BROWSER+" ,URL ==>> "+ENV);
	}

}
