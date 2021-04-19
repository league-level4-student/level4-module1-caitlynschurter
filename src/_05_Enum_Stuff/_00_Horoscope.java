package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	static void showHoroscope(Zodiac zodiac) {
		switch (zodiac) {
		case ARIES: {
			JOptionPane.showMessageDialog(null, "Peter Parker here to pick up a passport, please");
			break;
		}
		case TAURUS: {
			JOptionPane.showMessageDialog(null, "I'll do YOU one better: why is Gamora?");
			break;
		}
		case GEMINI: {
			JOptionPane.showMessageDialog(null, "Yeah I read the hobbit. Back in 1937, when it first came out");
			break;
		}
		case CANCER: {
			JOptionPane.showMessageDialog(null, "Boys, handle the military. Mommy will be right back");
			break;
		}
		case LEO: {
			JOptionPane.showMessageDialog(null, "You two look like a couple of seals fighting over a grape");
			break;
		}
		case VIRGO: {
			JOptionPane.showMessageDialog(null, "I'm about to die surrounded by the biggest idiots in the galaxy");
			break;
		}
		case LIBRA: {
			JOptionPane.showMessageDialog(null, "He killed 80 people in 2 days. ...He's adopted");
			break;
		}
		case SCORPIO: {
			JOptionPane.showMessageDialog(null, "They're not ripe");
			break;
		}
		case SAGITTARIUS: {
			JOptionPane.showMessageDialog(null, "Wazzuppp!");
			break;
		}
		case CAPRICORN: {
			JOptionPane.showMessageDialog(null, "THATS HOW IT FEELS");
			break;
		}
		case AQUARIUS: {
			JOptionPane.showMessageDialog(null, "Blueberry?");
			break;
		}
		case PISCES: {
			JOptionPane.showMessageDialog(null, "You boys know where the Smithsonian is? I'm here to pick up a fossil");
			break;
		}
		}
	}

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Enter a Zodiac, receive a Marvel quote");
		Zodiac z = Zodiac.valueOf(s);
		showHoroscope(z);
	}
}
