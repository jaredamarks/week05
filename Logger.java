package week05Interface;


	// Logger interface
	public interface Logger {
	    public void log(String message);
	    void error(String message);
	}

	// AsteriskLogger class implementing Logger interface
	class AsteriskLogger implements Logger {
	    
	    public void log(String message) {
	        System.out.println("***" + message + "***");
	    }

	    
	    public void error(String message) {
	        System.out.println("****************\n***Error: " + message + "***\n****************");
	    }
	}

	// SpacedLogger class implementing Logger interface
	class SpacedLogger implements Logger {
	    
	    public void log(String message) {
	        for (char c : message.toCharArray()) {
	            System.out.print(c + " ");
	        }
	        System.out.println();
	    }

	    
	    public void error(String message) {
	        System.out.print("ERROR: ");
	        for (char c : message.toCharArray()) {
	            System.out.print(c + " ");
	        }
	        System.out.println();
	    }
	}

	// App class with main method
	public class App {
	    public static void main(String[] args) {
	        // Instantiate instances of logger classes
	        Logger asteriskLogger = new AsteriskLogger();
	        Logger spacedLogger = new SpacedLogger();

	        // Test methods
	        asteriskLogger.log("Hello");
	        asteriskLogger.error("Hello");

	        spacedLogger.log("Hello");
	        spacedLogger.error("Hello");
	    }


	void log(String string) {
	
	}
	void error(String string) {
	
	}
	}

	

