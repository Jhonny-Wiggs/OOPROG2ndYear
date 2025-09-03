package encapsulationProblem3;

public class Employee {
	private String name;
    private double salary;

    public void setData(String n, double s) { 
    	name = n; 
    	salary = s; 
    }
    
    public void increase(double percent) { 
    	salary += salary * percent / 100; 
    }
    
    public String getName() {
    	return name; 
    } 
    
    public double getSalary() { 
    	return salary; 
    }
}
