package jmock;

public class Facebook implements ISocialNetwork{

	public ILogger logger;
	
	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	public void logIn(String name, String pw){
		logger.checkLogData(name, pw);
	}

}
