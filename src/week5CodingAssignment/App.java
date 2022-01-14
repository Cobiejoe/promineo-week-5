package week5CodingAssignment;

public class App {
	
	public static void main(String[] args) {

		/*
		 * AsteriskLogger
		 */
		
		Logger asterisk = new AsteriskLogger();
		Logger asteriskError = new AsteriskLogger();
		
		asterisk.log("Asterisk Test");
		
		System.out.println("\n");
		
		asteriskError.error("Asterisk Error Test");
		
		System.out.println("\n");
		
		
		/*
		 * SpacedLogger
		 */
		
		Logger space = new SpacedLogger();
		Logger spaceError = new SpacedLogger();
		
		space.log("Logger Test");
		
		System.out.println("\n");
		
		spaceError.error("Logger Error Test");
	}

}
