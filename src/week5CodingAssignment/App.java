package week5CodingAssignment;

import java.lang.System.Logger;

//step 9
	public class App {
	
	public static void main(String[] args) {
		
		
		//step 10
		
		loggerCA asteriskLogger = new AsteriskLogger();
		loggerCA spacedLogger = new SpacedLogger();
		
		asteriskLogger.Log("Hello, there!");
		System.out.println();
		asteriskLogger.Error("You were the chosen one Anakin!");
		
		System.out.println();
		
		spacedLogger.Log("Hello");
		spacedLogger.Error("I have the high ground!");
		
	} //step 11 in console

}
