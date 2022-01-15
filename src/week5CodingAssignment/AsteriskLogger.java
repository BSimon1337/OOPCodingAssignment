package week5CodingAssignment;

//step 3

public class AsteriskLogger implements loggerCA {

	
	//step 4
	@Override
	public void Log(String Log) {
		System.out.println("***" + Log + "***");
		
	}

	//step 5
	@Override
	public void Error(String Error) {
		String error = "ERROR: " + Error;
		System.out.println("****************");
		Log(error);
		System.out.println("****************");
		
	}

}
