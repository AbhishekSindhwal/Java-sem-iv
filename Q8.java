class Student{
    long id;
    String name, branch,city,university;
    Student(){
        this(5567890);
    }
    Student(long id){
        this(id,"Abhishek");
    }
    Student(long id,String name){
        this(id,name,"CSE");
    }
    Student(long id,String name,String branch){
        this(id,name,branch,"Dehradun");
    }
    Student(long id,String name,String branch,String city){
        this(id,name,branch,city,"GEHU");
    }
    Student(long id,String name,String branch,String city,String university){
        this.id=id;
        this.name=name;
        this.branch=branch;
        this.city=city;
        this.university=university;
    }    
    void getDetails(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Branch : "+branch);
        System.out.println("City : "+city);
        System.out.println("University : "+university);        
    }
    public static void main(String args[]){
        Student s1=new Student();
        s1.getDetails();
    }
}