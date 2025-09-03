package encapsulationProblem2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();

        acc.setName(JOptionPane.showInputDialog("Enter Account Holder Name:"));
        acc.deposit(Double.parseDouble(JOptionPane.showInputDialog("Enter Deposit Amount:")));
        acc.withdraw(Double.parseDouble(JOptionPane.showInputDialog("Enter Withdrawal Amount:")));

        JOptionPane.showMessageDialog(null,"Account Holder: " + acc.getName() + "\n" +
        								   "Final Balance: " + acc.getBalance());
	}
}
