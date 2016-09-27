import java.util.Scanner;

public class InteractRunner {
	public static void main (String[] arg) {
		Scanner reader = new Scanner (System.in);
		try {
			calculator calc = new calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println ("First?: ");
				String first = reader.next();
				System.out.println ("Secind?: ");
				String second = reader.next();
				calc.add(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println ("Result: "+ calc.get_result());
				calc.clearResult();
				System.out.println ("Exit?: ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}		
	}
}