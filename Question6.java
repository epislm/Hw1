import java.util.*;
public class Question6
{  
        public static void main(String args[])
        {
			String input;
			double x1,x2;
			double y1,y2;
			double r1,r2;
			double distance;
			
			Scanner my_scanner = new Scanner(System.in);
			
			System.out.print("Enter your first origin: ");
			input = my_scanner.next();
			
			String[] pointA = input.split(",/*");
			
			x1 = Double.parseDouble(pointA[0]);
			y1 = Double.parseDouble(pointA[1]);

			System.out.print("Enter your first circles radius: ");
			r1 = my_scanner.nextDouble();

			
			System.out.print("Enter your second origin: ");
			input = my_scanner.next();
			String[] pointB = input.split(",/*");
			
			x2 = Double.parseDouble(pointB[0]);
			y2 = Double.parseDouble(pointB[1]);
			
			System.out.print("Enter your second circles radius: ");
			r2 = my_scanner.nextDouble();
			
			distance = Math.sqrt(  Math.pow((x2 - x1)  ,2) + Math.pow( (y2 - y1 ) ,2 ) ); 
						
			System.out.println("The distance between the two circles is " + distance);
			
			if (distance > (r1 + r2)) {
			System.out.println("The circles do not touch."); }
			
			else if ((distance + r2) < r1 ) {
			System.out.println("Circle two is inside Circle one"); }
			
			else if ((distance + r1) <= r2) {
			System.out.println("Circle one is inside Circle two");}
			
			else {
			System.out.println("The circles overlap"); }
		
		}
}
		
