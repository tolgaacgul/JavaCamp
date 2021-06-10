package day4_interfaces1;

public class Utils {

	//Static ile direk çağırabiliyon
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger:loggers) {
			logger.log(message);
		}
	}
}
