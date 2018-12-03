public class MonthlyReader extends Readers {
	
    private String Membership;
    
	public MonthlyReader(String name, int id, int age, String sex, String address,String Membership) {
		
		super(name, id, age, sex, address);
		
		this.Membership=Membership;
		
	}
public String toString() {
		
		return (super.toString()+"Membership: "+Membership+"\n");
		
	}

}
