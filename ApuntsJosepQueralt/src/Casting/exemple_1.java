package Casting;

public class exemple_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double percPassed;
		int total = 50;
		int passed = 25;
		
		// Only in this occasion the variable passed is now double (casting)
		percPassed = ((double) passed / total) * 100;
		
		// We print the variable percPassed and is Double (for the cast)
		System.out.println(percPassed);
		
		// If we print "passed" we see is INT
		System.out.println(passed);
		
		// Putting "double" also cast the variable INT only for this print
		System.out.println((double) passed);
		
	}

}
