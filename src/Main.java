import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
		
		System.out.println("                 *************************"+"\n"+
	                        "                 Library Management System"+"\n"+
				                 "                 *************************");
		
		ParmanentReaders p1 = new ParmanentReaders("Abir",1,21,"M","Jatrabari,Dhaka","Annual Reader");
		ParmanentReaders p2 = new ParmanentReaders("Rakib",2,18,"M","Khilgao,Dhaka","Annual Reader");
		ParmanentReaders p3 = new ParmanentReaders("Shakil",3,25,"M","Baridhara,Dhaka","Annual Reader");
		ParmanentReaders p4 = new ParmanentReaders("Jebin",4,29,"F","Badda,Dhaka","Annual Reader");
		ParmanentReaders p5 = new ParmanentReaders("Katha",5,21,"F","Maniknagar,Dhaka","Annual Reader");
		ParmanentReaders p6 = new ParmanentReaders("Shohel",6,24,"M","Mirpur,Dhaka","Annual Reader");
		ParmanentReaders p7 = new ParmanentReaders("Rimon",7,23,"M","Uttara,Dhaka","Annual Reader");
		ParmanentReaders p8 = new ParmanentReaders("Abul",8,38,"F","Dhanmondi,Dhaka","Annual Reader");
		ParmanentReaders p9 = new ParmanentReaders("Kashem",9,29,"M","Mirpur,Dhaka","Annual Reader");
		ParmanentReaders p10 = new ParmanentReaders("Raihan",10,28,"M","Malibagh,Dhaka","Annual Reader");
		ParmanentReaders p11 = new ParmanentReaders("Ashik",11,25,"M","Nikunjo,Dhaka","Annual Reader");
		ParmanentReaders D1 = new ParmanentReaders("------",000,000,"--","---------","-------");
		
		MonthlyReader m1= new MonthlyReader("Emamul",12,21,"M","Bashundhara,Dhaka","Monthly Reader");
		MonthlyReader m2= new MonthlyReader("Raisul",13,22,"M","Muradpur,Dhaka","Monthly Reader");
		MonthlyReader m3= new MonthlyReader("Rinku",14,17,"M","Muradpur,Dhaka","Monthly Reader");
		MonthlyReader m4= new MonthlyReader("Neha",15,35,"F","Badda,Dhaka","Monthly Reader");
		MonthlyReader m5= new MonthlyReader("Nikita",16,19,"F","Gulshan,Dhaka","Monthly Reader");
		MonthlyReader m6= new MonthlyReader("Nabila",17,22,"F","Baridhara,Dhaka","Monthly Reader");
		MonthlyReader m7= new MonthlyReader("Kalam",18,45,"M","Muradpur,Dhaka","Monthly Reader");
		MonthlyReader m8= new MonthlyReader("Rahim",19,54,"M","Banani,Dhaka","Monthly Reader");
		MonthlyReader m9= new MonthlyReader("Kawsar",20,27,"M","Rampura Bazar,Dhaka","Monthly Reader");
		MonthlyReader D2= new MonthlyReader("-------",000,000,"--","---------","---------");
        
		
		OfficeWorker o1=new OfficeWorker( "Ahsan Ali", 21, 35,"M","Bonosree,Dhaka",25000,"Librarian-I");
		OfficeWorker o2=new OfficeWorker( "Rahima Akter", 22, 29,"F","Rampura,Dhaka",20000,"Librarian-II");
		OfficeWorker o3=new OfficeWorker( "Akash Ahmed", 23, 32,"M","Paltan,Dhaka",18000,"Accountant");
		OfficeWorker D3=new OfficeWorker( "---------", 000,000,"--","---------",000,"---------");
		
		Labours l1= new Labours("Abdul Mia", 24, 45, "M","Malibagh",15000,"Gurd-I(Day Shift)");
		Labours l2= new Labours("Karim Mia", 25, 42, "M","Kalabagan",15000,"Gurd-II(Night Shift)");
		Labours l3= new Labours("Sahana Begaum", 26, 39, "F","Rampura",10000,"Cleaner-I");
		Labours l4= new Labours("Raihana", 27, 40, "F","Badda",10000,"Cleaner-II");
		Labours D4= new Labours("------", 000, 000, "--","------",000,"------");
		
		

		Person[] arr= new Person[100];
		
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
		arr[3]=p4;
		arr[4]=p5;
		arr[5]=p6;
		arr[6]=p7;
		arr[7]=p8;
		arr[8]=p9;
		arr[9]=p10;
		arr[10]=p11;
		arr[11]=m1;
		arr[12]=m2;
		arr[13]=m3;
		arr[14]=m4;
		arr[15]=m5;
		arr[16]=m6;
		arr[17]=m7;
		arr[18]=m8;
		arr[19]=m9;
		arr[20]=o1;
		arr[21]=o2;
		arr[22]=o3;
		arr[23]=l1;
		arr[24]=l2;
		arr[25]=l3;
		arr[26]=l4;
		arr[27]=D1;
		arr[28]=D2;
		arr[29]=D3;
		arr[30]=D4;
		
		
		
		
		System.out.println("Whose information do you want to Know: ");
		System.out.println("1.Readers Information");
		System.out.println("2.Stuff's Information ");
		System.out.println("3.Delete information");
		System.out.println("Please enter Your Choice 1/2/3: ");
		int mainchoice = scan.nextInt();
		if(mainchoice==1) {                        
			System.out.println("Enter your choice by number: [1/2/3/4] ");
			System.out.println("1.Search by id ");
			System.out.println("2.View Every readers information");
			System.out.println("3.View All parmanent readers information");
			System.out.println("4.View all Annual readers information ");
			int k=scan.nextInt();
			if(k==2)
			{
		for(int i=0;i<20;i++) 
		    {
			
	System.out.println(arr[i]);
	 
		    }
		
			}
		if(k==1)
		{
			System.out.println("Please enter the id: ");
			int b= scan.nextInt();
			if(b>20) {
				System.out.println("Sorry,not a valid id..!!!");
			}
			else {
			System.out.println(arr[b-1]);
			}
		}
		if(k==3)
		{
			for(int i=0;i<12;i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		if(k==4)
		{
			for(int i=12;i<20;i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		
		System.out.println("Want to delete any record..??");
		System.out.println("Input 1 for yes...");
		System.out.println("Input 2 for No...");
		int p= scan.nextInt();
		if (p==1)
		{
			
			System.out.println("Please Enter Id of the reader that You want to delete");
			int id=scan.nextInt();
			System.out.println("His/Her Information: "+"\n"+"\n");
			
			System.out.println(arr[id-1]);
			
			if(id<=11)
			{
				arr[id-1]=D1;
			}
			if(id>11 && id<=20);
			{
				arr[id-1]=D2;
			}
			if(id>20)
			{
				System.out.println("Sorry Reader Does not Exist....");
			}
			System.out.println("Do You want to check if the readers record was deleted..??");
			
			System.out.println("Input 1 for yes...");
			System.out.println("Input 2 for No...");
			int cc= scan.nextInt();
			
			if(cc==1)
			{
				System.out.println("Please Enter Id of the reader that You want to Check");
				int idc=scan.nextInt();
				System.out.println(arr[idc-1]);
				System.out.println("Thanks !! for using this software");
			}
			if(cc==2)
			{
				System.out.println("Thanks For Using the Software");
			}
			if(cc>2)
			{
				System.out.println("Wrong Input");
			}
		}
		if(p==2)	
		{
			System.out.print("Ok, Thanks For Using the Software !!!");
		}
			
		if(p>2)
		{
			System.out.println("Wrong Input");
		}
		
		
			}
		
		
		
if(mainchoice==2)
{
	System.out.println("Enter your choice by number: [1/2/3/4] ");
	System.out.println("1.Search worker by id ");
	System.out.println("2.View Every workers information");
	System.out.println("3.View All Office Workers information");
	System.out.println("4.View All labours information ");
	
	int k=scan.nextInt();
	if(k==2)
	{
for(int i=20;i<27;i++) 
    {
	
System.out.println(arr[i]);

    }

	}
if(k==1)
{
	System.out.println("Please enter the worker's id: ");
	int b= scan.nextInt();
	if(b<20) {
		System.out.println("Sorry,Worker does not exist..!!!");
	}
	else {
	System.out.println(arr[b-1]);
	}
}
if(k==3)
{
	for(int i=20;i<23;i++)
	{
		System.out.println(arr[i]);
	}
	
}
if(k==4)
{
	for(int i=23;i<27;i++)
	{
		System.out.println(arr[i]);
	}
	
}

System.out.println("Want to delete any record..??");
System.out.println("Input 1 for yes...");
System.out.println("Input 2 for No...");
int p= scan.nextInt();
if (p==1)
{
	System.out.println("Please Enter Id of the worker that You want to delete");
	int id=scan.nextInt();
	System.out.println("His/Her Information: "+"\n"+"\n");
	
	System.out.println(arr[id-1]);
	
	
	if(id>20 && id<24)
	{
		arr[id-1]=D3;
	}
	if(id>23 && id<27);
	{
		arr[id-1]=D4;
	}
	if(id<20 && id>26)
	{
		System.out.println("Sorry worker Does not Exist....");
	}
	System.out.println("Do You want to check if the readers record was deleted..??");
	
	System.out.println("Input 1 for yes...");
	System.out.println("Input 2 for no...");
	int cc= scan.nextInt();
	
	if(cc==1)
	{
		System.out.println("Please Enter Id of the Worker that You want to Check");
		int idc=scan.nextInt();
		System.out.println(arr[idc-1]);
		System.out.println("Thanks !! for using this software");
		
	}
	if(cc==2)
	{
		System.out.println("Thanks For Using the Software");
	}
	if(cc>2)
	{
		System.out.println("Wrong Input");
	}
	
}
if(p==2)	
{
	System.out.print("Ok, Thanks For Using the Software  !!!");
}
	
if(p>2)	
{
	System.out.println("Wrong Input");
}

}
if(mainchoice==3)
{
	System.out.println("Whose information you want to delete");
	System.out.println("Enter 1 for reader's..");
	System.out.println("Enter 2 for stuff's..");
	int choice = scan.nextInt();
	if(choice==1) 
	{
		System.out.println("Please Enter Id of the reader that You want to delete");
		int id=scan.nextInt();
		System.out.println("His/Her Information: "+"\n"+"\n");
		
		System.out.println(arr[id-1]);
		
		if(id<=11)
		{
			arr[id-1]=D1;
		}
		if(id>11 && id<=20);
		{
			arr[id-1]=D2;
		}
		if(id>20)
		{
			System.out.println("Sorry Reader Does not Exist....");
		}
		System.out.println("Do You want to check if the readers record was deleted..??");
		
		System.out.println("Input 1 for yes...");
		System.out.println("Input 2 for No...");
		int cc= scan.nextInt();
		
		if(cc==1)
		{
			System.out.println("Please Enter Id of the reader that You want to Check");
			int idc=scan.nextInt();
			System.out.println(arr[idc-1]);
			
			System.out.println("Thanks !! for using this software");
		}
		if(cc==2)
		{
			System.out.println("Thanks For Using the Software");
		}
		if(cc>2)
		{
			System.out.println("Wrong Input");
		}
	}
	if (choice==2)
	{
		System.out.println("Please Enter Id of the worker that You want to delete");
		int id=scan.nextInt();
		System.out.println("His/Her Information: "+"\n"+"\n");
		
		System.out.println(arr[id-1]);
		
		
		if(id>20 && id<24)
		{
			arr[id-1]=D3;
		}
		if(id>23 && id<27);
		{
			arr[id-1]=D4;
		}
		if(id<20 && id>26)
		{
			System.out.println("Sorry worker Does not Exist....");
		}
		System.out.println("Do You want to check if the readers record was deleted..??");
		
		System.out.println("Input 1 for yes...");
		System.out.println("Input 2 for no...");
		int cc= scan.nextInt();
		
		if(cc==1)
		{
			System.out.println("Please Enter Id of the Worker that You want to Check");
			int idc=scan.nextInt();
			System.out.println(arr[idc-1]);
			System.out.println("Thanks !! for using this software");
			
		}
		if(cc==2)
		{
			System.out.println("Thanks For Using the Software");
		}
		if(cc>2)
		{
			System.out.println("Wrong Input");
		}
	}
	
}

if(mainchoice>3)	
{
	System.out.println("Wrong Input");
}
		
	
}
	
}


