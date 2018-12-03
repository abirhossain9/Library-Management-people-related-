
public class OfficeWorker extends Stuff {
	
	private double salary;
	private String post;

	public OfficeWorker(String name, int id, int age, String sex, String address,double salary,String post) {
		super(name, id, age, sex, address);
		
		this.salary=salary;
		this.post=post;
		
	}
	
	
	public String toString()    //Calling the toString function of Superclass
	{                           //it gets all the characteristics of the the toString of Superclass 
		
		return(super.toString()+"Post: "+post+"\n"+"Salary: "+salary+"\n");
		
	}

}
