package day4_interfaces1;

public class FileLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("FileLog: " + "'" + message + "'");
	}

}
