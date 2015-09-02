import java.util.*;
public class Question2
{  
        public static void main(String args[])
        {
			
			double radius;
			double result;
			
			Scanner my_scanner = new Scanner(System.in);
			System.out.println("Enter a radius");
			while (my_scanner.hasNextDouble()){
			
			
			radius = my_scanner.nextDouble();
			
			
			result = Math.PI * Math.pow(radius,2);
            
			System.out.println(result);
			
			System.out.println("Enter a radius");
			}
			
        }
}