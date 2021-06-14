package day3_2inheritance;

//ilkel ve hatalar cıkarabilecek bir kod orenegi icin kurulmus sınıf
public class LogManager {

	public void log(int logType) {
		if(logType == 1) {
			System.out.println("VeriTabanı Loglandı");
		}else if(logType == 2 ) {
			System.out.println("Dosyaya Loglandı");
		}
	}
}
