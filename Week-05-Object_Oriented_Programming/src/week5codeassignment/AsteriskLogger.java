package week5codeassignment;

public class AsteriskLogger implements Logger{
	//class implements logger, auto add methods
	
	@Override
	public void log(String text) {
		// TODO Auto-generated method stub
		
		System.out.println("***" + text + "***");  //print out the String between 3 ***
	}

	@Override
	public void error(String text) {
		// TODO Auto-generated method stub
		//.repeat guide https://www.geeksforgeeks.org/string-class-repeat-method-in-java-with-examples/
		
		String middle = "****ERROR:" + text + "***";
		
		String box =  "*".repeat(middle.length());     //add String to surround error .length to mirror length of middle message
				
		System.out.println(box);
		System.out.println(middle);
		System.out.println(box);
	}

}
