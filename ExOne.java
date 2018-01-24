import java.util.Scanner;

public class ExOne {

		
	public static void main( String[] args)
	{
		
		
		String varUser = "abc";
		String varPass = "abc";
		
		Scanner uiScan = new Scanner(System.in);
		
		System.out.println( "Enter Username: ");
		String ioUser =uiScan.next();		
		
		System.out.println( "Enter Password: ");
		String ioPass =uiScan.next();
		
		uiScan.close();
		
		if (varUser.equals(ioUser) && varPass.equals(ioPass))
		{
			System.out.println("Welcome User");
		}
		else
		{
			System.out.println("Incorrect username or password.");
		}
		
		System.exit( 0 );
	}	
}