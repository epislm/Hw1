import java.util.*;
public class Question5
{  
        public static void main(String args[])
        {
			String input;
			Scanner my_scanner = new Scanner(System.in);
			
			System.out.print("Enter your first point: ");
			input = my_scanner.next();
			String[] pointA = input.split(",/*");
			
			System.out.print("Enter your second point: ");
			input = my_scanner.next();
			String[] pointB = input.split(",/*");
			
			System.out.print("Enter your third point: ");
			input = my_scanner.next();
			String[] pointC = input.split(",/*");
		
			System.out.println( "Your points are: \n" + "A: (" + pointA[0] + "," + pointA[1] + ") B: (" + pointB[0] + "," + pointB[1] + ") C: (" + pointC[0] + "," + pointC[1]+ ")");
			
			double lenOfAC =  Math.sqrt(( Math.pow(( Double.parseDouble(pointA[0]) - Double.parseDouble(pointC[0]))  ,2) + Math.pow(( Double.parseDouble(pointA[1]) - Double.parseDouble(pointC[1]) ) ,2 ) )); 
			double lenOfAB =  Math.sqrt(( Math.pow(( Double.parseDouble(pointA[0]) - Double.parseDouble(pointB[0]))  ,2) + Math.pow(( Double.parseDouble(pointA[1]) - Double.parseDouble(pointB[1]) ) ,2 ) )); 
			double lenOfBC =  Math.sqrt(( Math.pow(( Double.parseDouble(pointB[0]) - Double.parseDouble(pointC[0]))  ,2) + Math.pow(( Double.parseDouble(pointB[1]) - Double.parseDouble(pointC[1]) ) ,2 ) )); 
			
			if( ((lenOfAB + lenOfBC) > lenOfAC) &&  ((lenOfAB + lenOfAC) > lenOfBC) && ((lenOfBC + lenOfAC) > lenOfAB) ) {
			
				System.out.println("The triangle is a real triangle.");
				
				}
					else 
						System.out.println("The triangle is a lie.");
		}
}