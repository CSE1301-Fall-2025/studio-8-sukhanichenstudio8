package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
 private String[] choices;


	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices=choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for (int i=1;i<choices.length+1;i++){
			System.out.println(i+". "+ choices[i-1]);
		}
		
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
		
	}
	
	public static void main(String[] args) {
		String [] choicesA= {"1","2","3","4"};
		MultipleChoiceQuestion a = new MultipleChoiceQuestion("what is 2+2??", "4", 2, choicesA);
		a.displayPrompt();
		a.checkAnswer("4");
	}

}
