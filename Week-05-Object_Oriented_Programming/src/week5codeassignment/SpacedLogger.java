package week5codeassignment;

public class SpacedLogger implements Logger {

	//class implements logger, auto add methods
	@Override
	public void log(String text) {
		// TODO Auto-generated method stub
		System.out.println(addSpace(text)); //call the method to add spaces
	}

	@Override
	public void error(String text) {
		// TODO Auto-generated method stub
		
		System.out.println("ERROR:" + addSpace(text)); // add error prefix and call method
		
	}
	private String addSpace(String text) {
		StringBuilder spacedOut = new StringBuilder(); //string builder
		for (int i = 0; i < text.length(); i++) { //for loop to iterate over input and add spaces 
	
            spacedOut.append(text.charAt(i));
            if (i < text.length() - 1) {
                spacedOut.append(" "); //add space at each
            }
        }
        return spacedOut.toString(); //return in SB
	}

}
