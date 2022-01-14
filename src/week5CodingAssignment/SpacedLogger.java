package week5CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		int n = log.length();
		for (int i = 0; i < n; i++) {
			System.out.print(log.charAt(i) + " ");
		}
	}

	@Override
	public void error(String error) {
		String errorString = "Error: ";
		System.out.print(errorString);
		int n = error.length();
		for (int i = 0; i < n; i++) {
			System.out.print(error.charAt(i) + " ");
		}
	}

}
