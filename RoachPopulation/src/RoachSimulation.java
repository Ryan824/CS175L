import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String input = JOptionPane.showInputDialog("Enter the inital roach population: ");
	double roachPopulation = Double.parseDouble(input);
	RoachPopulation bugs = new RoachPopulation(roachPopulation);
	bugs.getRoaches();
	DecimalFormat decFormat = new DecimalFormat("0");
	JOptionPane.showMessageDialog(null, "The initial roach population is " + decFormat.format(bugs.getRoaches()));
	bugs.breed();
	JOptionPane.showMessageDialog(null, "The roach population after cycle 1 breeding is " + decFormat.format(bugs.getRoaches()));
	String input2 = JOptionPane.showInputDialog("Enter the spray percentage for cycle 1: ");
	double pct = Double.parseDouble(input2);
	bugs.spray(pct);
	JOptionPane.showMessageDialog(null, "The roach population after cycle 1 50% spraying is " + decFormat.format(bugs.getRoaches()));
	bugs.breed();
	JOptionPane.showMessageDialog(null, "The roach population after cycle 2 breeding is " + decFormat.format(bugs.getRoaches()));
	bugs.spray(pct + .10);
	JOptionPane.showMessageDialog(null, "The roach population after cycle 2 60% spraying is " + decFormat.format(bugs.getRoaches()));	
	bugs.breed();
	JOptionPane.showMessageDialog(null, "The roach population after cycle 3 breeding is " + decFormat.format(bugs.getRoaches()));
	bugs.spray(pct + .20);
	JOptionPane.showMessageDialog(null, "The roach population after cycle 3 70% spraying is " + decFormat.format(bugs.getRoaches()));	
	bugs.breed();
	JOptionPane.showMessageDialog(null, "The roach population after cycle 4 breeding is " + decFormat.format(bugs.getRoaches()));
	bugs.spray(pct + .30);
	JOptionPane.showMessageDialog(null, "The roach population after cycle 4 80% spraying is " + decFormat.format(bugs.getRoaches()));	
	}

}
