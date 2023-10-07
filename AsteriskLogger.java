// AsteriskLogger class for week 5 coding assignment
// - Liam Andrus

public class AsteriskLogger implements Logger {

	@Override
	public void log(String s) {
		System.out.println("***" + s + "***");
		
	}

	@Override
	public void error(String s) {
		String asteriskLength = "";
		for (int i = 0; i < s.length(); i++) {
			asteriskLength += "*";
		}
		
		System.out.println("**********" + asteriskLength + "***");
		System.out.println("***Error: "+  s + "***");
		System.out.println("**********" + asteriskLength + "***");
		
	}

}
