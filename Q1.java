class Student{
	long id;
	String name;
	String branch;
	String university;
	void setDetails(long i,String n,String b,String u)
	{
		id=i;
		name=n;
		branch=b;
		university=u;
	}
	void getDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(branch);
		System.out.println(university);
	}
}
class run
{
	public static void main(String args[]){
		Student s1=new Student();
		s1.setDetails(2001,"Abhishek","GEHU","Dehradun");
		s1.getDetails();	
	}
}