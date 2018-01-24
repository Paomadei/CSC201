import java.util.Scanner;

public class HeatCalc {

		
	public static void main( String[] args)
	{
		
		double wMass, iTemp, fTemp, eNeed;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Mass of water in kg: ");
		wMass = sc.nextDouble();		
		
		System.out.println( "Water initial temp: ");
		iTemp = sc.nextDouble();
		
		System.out.println( "Water final temp: ");
		fTemp = sc.nextDouble();
		
		sc.close();
		
		eNeed = wMass * (fTemp - iTemp) * 4814.0;
		
		System.out.println( "Energy needed (J) is: " + eNeed);
		
		System.exit( 0 );
	}	
}