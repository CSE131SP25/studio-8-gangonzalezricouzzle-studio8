package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	private String[] choice;

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		choices = choice; 
		
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		throw new NotYetImplementedException();
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		displayPrompt(); 
		for (int i = 0; i< choice.length; i++) {
			System.out.println((i+1)+ ": " + choice[i]); 
		}
		throw new NotYetImplementedException();
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choice; 
		//throw new NotYetImplementedException();
	}
	
	public static void main(String[] args) {
		
		// TODO: create your own MultipleChoiceQuestion
	}

}
