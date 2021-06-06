package day4_interfaces;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println(message + " adlı mesaj Database 'e loglando!");
		
	}

}
