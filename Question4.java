import java.util.*;
public class Question4
{  
        public static void main(String args[])
        {
			Scanner my_scanner = new Scanner(System.in);
			while (my_scanner.hasNextDouble()){
				double number = my_scanner.nextDouble();
				System.out.println(number);
			}
		}
}