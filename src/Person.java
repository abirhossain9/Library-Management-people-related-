//SuperClass

public class Person { 
 	
	private String name;  
	private int id;
	private int age;
	private String sex;
	private String address;
	
	public Person(String name,int id,int age, String sex,String address) //creating constructor
	{
		
		this.name=name;
		this.id=id;
		this.age=age;
		this.sex=sex;
		this.address=address;
		
	}

	public String  toString() //creating toString Function 
	{
		
      return ("Name: "+name+"\n"
        +"Id: "+id+"\n"+
        		"Age: "+age+"\n"+
        "Sex: "+sex+"\n"+
        		"Address: "+address+"\n");		
	
	}
}
