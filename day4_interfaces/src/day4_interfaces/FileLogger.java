package day4_interfaces;

public class FileLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println(message + " adlı mesaj Dosyalandı!"); 
	}

}
