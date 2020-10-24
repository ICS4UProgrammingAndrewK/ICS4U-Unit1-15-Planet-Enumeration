import java.util.Scanner;
/**
*
* class PlanetEnumeration
*
* @author  Andrew Kuekam
* @version 1.0
* @since   2020-18-09
*/
public class PlanetEnumeration {
	public static void main(String[] args) {
		
    	Scanner userInput = new Scanner(System.in);
		
		System.out.println(" Enter the planet you will like to go to!");
		System.out.print(" Mercury, ");
		System.out.print(" Venus, ");
		System.out.print(" Earth, ");
		System.out.print(" Mars, ");
		System.out.print(" Jupiter, ");
		System.out.print(" Saturn, ");
		System.out.print(" Uranus, ");
		System.out.println(" Neptune. ");
		System.out.println();
		
		//declare int
		String userChoose;
		
		//convert userchoose to input
		userChoose = userInput.next();
		
		if (userChoose.equals("Mercury")) {
			System.out.println(" You will like to go to Mercury planet #1 ");
			
		} else if (userChoose.equals("Venus")) {
			System.out.println(" You will like to go to Venus planet #2 ");
			
		} else if (userChoose.equals("Earth")) {
			System.out.println(" You will like to go to Earth planet #3 ");
			
		}	else if (userChoose.equals("Mars")) {
			System.out.println(" You will like to go to Mars planet #4 ");
			
		} else if (userChoose.equals("Jupiter")) {
			System.out.println(" You will like to go to Jupiter planet #5 "); 
			
		} else if (userChoose.equals("Saturn")) {
			System.out.println(" You will like to go to Saturn planet #6 "); 
			
		} else if (userChoose.equals("Uranus")) {
			System.out.println(" You will like to go to Uranus planet #7 ");
			
		} else if (userChoose.equals("Neptune")) {
			System.out.println(" You will like to go to Neptune planet #8 ");
			
		} else {
			System.out.println( " Error " );
		}
	}
}