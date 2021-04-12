package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch (input) {
		case 0:
			JOptionPane.showMessageDialog(null, "Enjoy your last few hours of freedom");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Heh. Good luck with today, you're gonna need it");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "'Tis an Elevate night");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "'Tis a Thrive night");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Did she actually pick up the phone today??");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "ITS FRIDAY :D");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Time to discover how intense your art block is");
			break;
		}
	}
}
