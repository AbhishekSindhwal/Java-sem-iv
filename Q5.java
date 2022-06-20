class Student{
	long id;
	String name;
	static String branch="Gehu";
	static String university="Dehradun";
	void setDetails(long i,String n)
	{
		id=i;
		name=n;
	}
	void getDetails()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Branch : "+branch);
		System.out.println("University : "+university);
	}
}
class run
{
	public static void main(String args[]){
		Student s1=new Student(),s2=new Student();
		s1.setDetails(2056701,"Abhishek");
        s2.setDetails(4567890,"Aman");
		s1.getDetails();
        s2.getDetails();	
	}
}