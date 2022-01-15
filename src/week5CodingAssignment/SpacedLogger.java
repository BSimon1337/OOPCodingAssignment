package week5CodingAssignment;

//step 3

public class SpacedLogger implements loggerCA{

	
	//step 6 + 7
	@Override
	public void Log(String Log) {
		StringBuilder log = new StringBuilder();
		for(int i = 0;i < Log.length(); i++) {
			log.append(Log.charAt(i)).append(" ");
		}
		System.out.println(log);
		
	}

	//step 8
	@Override
	public void Error(String Error) {
		String error = "ERROR: " + Error;
		Log(error);
		
	}

}
