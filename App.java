// Main application class for testing interface and classes
// - Liam Andrus

public class App {
	public static void main(String args[]) {
		AsteriskLogger aLog = new AsteriskLogger();	
		SpacedLogger sLog = new SpacedLogger();
		
		
		System.out.println("Asterisk Logger Test: ");
		aLog.log("Coolio");
		aLog.error("Coolio");
		
		System.out.println("\n");
		System.out.println("Spaced Logger Test: ");
		sLog.log("Ur Trolling");
		sLog.error("Ur Trolling");
	}
}
