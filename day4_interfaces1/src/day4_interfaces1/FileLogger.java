package day4_interfaces1;

public class FileLogger implements Logger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Dosyaya Loglandı: " + "'" + message + "'");
	}

}
