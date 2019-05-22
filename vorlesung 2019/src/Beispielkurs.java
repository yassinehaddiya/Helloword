import javax.swing.JOptionPane;

/**
 * Class reads the user input and print it to the terminal.
 * @author Vorname Nachname
 *
 */
public class Beispielkurs {
	/**
	 * Methods justs reads the user input and prints it to the terminal.
	 * @param args No arguments needed.
	 */

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("ist es sicher?");
		System.out.println(input);	
		String input1 = JOptionPane.showInputDialog("fertigsstellungsdatum");
		System.out.println("fertigstellungsdatum ="+input1);
		
		
	}
}
