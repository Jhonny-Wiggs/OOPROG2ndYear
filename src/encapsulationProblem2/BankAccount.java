package encapsulationProblem2;

public class BankAccount {
	private String name;
    private double balance;

    public void setName(String n) { 
    	name = n; 
    }
    
    public void deposit(double amt) { 
    	balance += amt; 
    }
    
    public void withdraw(double amt) { 
    	if (amt <= balance) balance -= amt; 
    }
    
    public String getName() { 
    	return name; 
    }
    
    public double getBalance() { 
    	return balance; 
    }

}
