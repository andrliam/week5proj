// SpacedLogger class for week 5 coding assignment
// - Liam Andrus

public class SpacedLogger implements Logger {

	@Override
	public void log(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result += (s.charAt(i) + " ");
		}
		System.out.println(result);
	}

	@Override
	public void error(String s) {
		String result = "ERROR: ";
		for (int i = 0; i < s.length(); i++) {
			result += (s.charAt(i) + " ");
		}
		System.out.println(result);
		
	}

}
