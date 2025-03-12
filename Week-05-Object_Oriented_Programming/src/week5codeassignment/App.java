package week5codeassignment;

public class App {

	public static void main(String[] args) {
		
        Logger asteriskLogger = new AsteriskLogger();  //instantiate
        Logger spacedLogger = new SpacedLogger();   //instantiate
        
        System.out.println("Test 1 -  AsteriskLogger:");
        asteriskLogger.log("Shazaam");
        asteriskLogger.error("Shazaam");
        
        System.out.println("Test 2 -  AsteriskLogger:");
        spacedLogger.log("Longer Test");
        spacedLogger.error("Longer Test");
        
        System.out.println("Test 1 -  SpacedLogger:");
        spacedLogger.log("Swanson");
        spacedLogger.error("Swanson");
    
        System.out.println("Test 2 -  SpacedLogger:");
        spacedLogger.log("WideOpen");
        spacedLogger.error("WideOpen");
    
        System.out.println("Test 3 -  SpacedLogger:");
        spacedLogger.log("Thisisamuchlongerinput");
        spacedLogger.error("Thisisamuchlongerinput");
	}

}
